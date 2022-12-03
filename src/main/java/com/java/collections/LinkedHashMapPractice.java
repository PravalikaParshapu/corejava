package com.java.collections;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {

    @Test
    public void add(){
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(1,"d");
        map.put(3,"c");
        System.out.println(map);

    }
}
