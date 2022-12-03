package com.java.collections;

import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice {

    @Test
    public void add(){
        Map<Integer, Integer> map = new TreeMap<>();
        map.put(1,1);
        map.put(4,4);
        map.put(3,3);
        map.put(2,2);
        System.out.println(map);
    }
}
