package com.java.collections;

import com.java.generics.Student5;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    @Test
    public void createArrayList(){
        List list1 = new ArrayList();
        System.out.println(list1);
    }

    @Test
    public void add(){
        List list1 = new ArrayList();
        list1.add("Jack");
        list1.add(10);
        list1.add(1.23);
        System.out.println(list1);
    }

    @Test
    public void createArrayList2(){
        List<String> list1 = new ArrayList<String>();
        System.out.println(list1);
    }

    @Test
    public void add2(){
        List<String> list1 = new ArrayList<>();
        list1.add("Hii");
        list1.add("10");
        System.out.println(list1);
        List<Student5> studentList = new ArrayList<>();
        Student5 student5 = new Student5();
        studentList.add(student5);
        System.out.println(studentList);
    }

    @Test
    public void addAll(){
        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("Pravalika");
        list1.add("Reddy");
        List<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("Anusha");
        list2.add("Reddy");
        System.out.println(list1);
        System.out.println(list2);
        list2.addAll(list1);
        System.out.println(list1);
        System.out.println(list2);
    }
}
