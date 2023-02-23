package edu.illinois.cs.test.pojo;

import java.util.HashSet;
import java.util.Set;

public class ValuePool{
    public Set<Integer> integersPool = new HashSet<>();
    public Set<String> stringsPool = new HashSet<>();
    public Set<Character> charactersPool = new HashSet<>();
    public Set<Double> doublesPool = new HashSet<>();
    public Set<Boolean> booleansPool = new HashSet<>();
    public Set<Object> objectsPool = new HashSet<>();

    // add the value into the pool
    public void addValue(Object o){
        synchronized (this) {
            if(o instanceof Integer){
                integersPool.add((Integer) o);
            }else if(o instanceof String){
                stringsPool.add((String) o);
            }else if(o instanceof Character){
                charactersPool.add((Character) o);
            }else if(o instanceof Double){
                doublesPool.add((Double) o);
            }else if(o instanceof Boolean){
                booleansPool.add((Boolean) o);
            }else{
                objectsPool.add(o);
            }
        }
    }
}
