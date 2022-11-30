package com.java.collections;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

    @Test
    public void create(){
        Set set = new HashSet();
        System.out.println(set);
    }

    @Test
    public void createTo(){
        Set<String> set = new HashSet<>();
        System.out.println(set);
    }

    @Test
    public void add(){
        Set<String> set = new HashSet<>();
        set.add("Hi");
        set.add("Hello");
        set.add("welcome");

        set.stream().forEach(str -> System.out.println(str));
        System.out.println(set);
    }

}
