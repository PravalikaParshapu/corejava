package com.java.collections;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetPractice {

    @Test
    public void create(){
        Set<Integer> set = new LinkedHashSet();
        System.out.println(set);
    }

    @Test
    public void add(){
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("3");
        set.add("2");
        set.add("2");
        set.add("4");
        set.add("1");
        set.add("6");
        set.add("5");
        System.out.println(set);
    }

    @Test
    public void iterate(){
        Set<String> set = new LinkedHashSet<>();
        set.add("Hi");
        set.add("Hiii");
        set.add("hello");
        System.out.println(set);
        for(String string1 : set){
            System.out.println(string1);
        }
        set.stream().forEach(str -> System.out.println(str));
    }


}
