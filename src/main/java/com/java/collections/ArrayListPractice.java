package com.java.collections;

import com.java.generics.Student5;
import org.junit.Test;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListPractice {

    @Test
    public void createArrayList(){
        List list1 = new ArrayList();
        System.out.println(list1);
    }

    @Test
    public void add(){
        List<Object> list1 = new ArrayList();
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

    @Test
    public void iterate(){
        List<String> list1 = new ArrayList();
        list1.add("Hii");
        list1.add("Hello");
        list1.add("Bye");
        //using iterator
        Iterator<String> iterator = list1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for(int i=0; i<list1.size();i++){
            System.out.println(list1.get(i));
        }
        for(String str : list1){
            System.out.println(str);
        }
        list1.stream().forEach(str -> System.out.println(str));  //lambda expression
    }

    @Test
    public void filter(){
        List<String> list= new ArrayList();
        list.add("My");
        list.add("Friends");
        list.add("are");
        list.add("Best");
//        list.stream().forEach(str -> System.out.println(str) );
//        list.stream().filter(str1 -> {
//            return !str1.startsWith("F");
//        } ).forEach(str -> System.out.println(str));
        list.stream().filter(str1 -> {
            int length = str1.length();
            return length>3;
        }).forEach(str1 -> System.out.println(str1));

        list.stream().map( str1 -> {
            return str1.toUpperCase();
        }).forEach(str1 -> System.out.println(str1));

        list.stream().map( str1 -> {
            return str1.toLowerCase();
        }).forEach(str1 -> System.out.println(str1));

      List<String> collectingStrings =  list.stream().filter(str1 -> {
            return str1.length()>3;
        }).collect(Collectors.toList());

        collectingStrings.stream().forEach(str1 -> System.out.println(str1));
    }

    @Test
    public void task2(){
        List<String> list = new ArrayList<>();
        list.add("Hiii");
        list.add("Hi");
        list.add("Hiiiiiii");
        list.stream().forEach(str -> System.out.println(str));
    }
}
