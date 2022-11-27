package com.java;

import org.junit.Test;

public class StringsPractice {

    @Test
    public void createString(){
        String s1="Hello";
        String s2= new String("World");
        System.out.println(s1);
        System.out.println(s2);
    }

    @Test
    public void charAt(){
        String s1= "Hello World";
        char ch = s1.charAt(4);
        System.out.println(ch);
    }

    @Test
    public void subString(){
       String s1= "Hii Pravalika";
       String s2 = s1.substring(4);
        System.out.println(s2);
        String s3= s1.substring(0,3);
        System.out.println(s3);
    }

    @Test
    public void concat(){
        String s1 = "How are you";
        String s2 = " Well and Good";
        String s3 = s1+s2;
        System.out.println(s3);
        String s4 = s1.concat(s2);
        System.out.println(s4);
    }
}
