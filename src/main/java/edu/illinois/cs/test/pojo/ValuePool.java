package edu.illinois.cs.test.pojo;

import java.util.HashSet;
import java.util.Set;

public class ValuePool{
    public Set<Object> valuePool = new HashSet<>();

    // add the value into the pool
    public void addValue(Object o){
        synchronized (this) {
            valuePool.add(o);
        }
    }
}
