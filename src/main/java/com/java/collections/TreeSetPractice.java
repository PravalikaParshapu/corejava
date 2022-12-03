package com.java.collections;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {


    @Test
    public void create(){
        Set<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(2);
        set.add(1);
        System.out.println(set);
    }


}
