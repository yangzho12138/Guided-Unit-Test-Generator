package edu.illinois.cs.test;

import java.util.ArrayList;
import java.util.List;

public class ValuePool {
    List<Object> valuePool = new ArrayList<>();

    // add the value into the pool
    public void addValue(Object o){
        synchronized (this) {
            valuePool.add(o);
        }
    }

    // check whether this object could be added into the value pool
//    public boolean checkValue(Object o){
//
//    }
}
