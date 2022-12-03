package com.java.collections;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

    @Test
    public void create(){
        Map<Integer, String> map = new HashMap<>();
        System.out.println(map);
    }

    @Test
    public void put(){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,3);
        map.put(1,4);
        map.put(4,2);
        System.out.println(map);
    }

    @Test
    public void get(){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        map.put(1,2);
        map.put(2,1);
        System.out.println(map);
        Integer value = map.get(1);
        System.out.println(value);
        Integer value1 = map.get(3);
        System.out.println(value1);
    }

    @Test
    public void getOrDefault(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2, "b");
        System.out.println(map);
        String value = map.get(3);
        System.out.println(value);
        int length = value.length();
        String value1 = map.getOrDefault(3, "unknown");
        System.out.println(value1);
    }

    @Test
    public void putAll(){
        Map<Integer, String> map =new HashMap<>();
        Map<Integer, String> map1 = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map1.put(4, "x");
        map1.put(3, "y");
        map1.put(6,"z");
        System.out.println(map);
        System.out.println(map1);
        map1.putAll(map);
        System.out.println(map);
        System.out.println(map1);
    }

    @Test
    public void iterate(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3,"c");
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+ ":" + entry.getValue());
        }
        map.forEach((key,value) -> System.out.println(key+ ":" + value));
    }

    @Test
    public void remove(){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,0);
        map.put(2,3);
        map.put(2,4);
        System.out.println(map);
        map.remove(3);
        System.out.println(map);
    }
}
