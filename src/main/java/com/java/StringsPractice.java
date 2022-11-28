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

    @Test
    public void divideString(){
        String s1 = "Hello-World";
        String[] strArray = s1.split("W");
        for(int i=0; i<strArray.length; i++){
            System.out.println(strArray[i]);
        }
        for(String s: strArray){
            System.out.println(s);
        }
    }

   @Test
     public  void toLowerCase(){
        String s1 = "IAM GOOD";
        String s2 = s1.toLowerCase();
       System.out.println(s2);
   }
   @Test
    public void toUpperCase(){
        String s1 = "kansas";
        String s2 = s1.toUpperCase();
       System.out.println(s2);
   }

   @Test
    public void captilaize() {
       String s1 = "hello-world-welcome-to-java";
       String[] strArray = s1.split("-");
       String result = "";
       for (String s : strArray) {
           System.out.println(s);
           String firstLetter = s.substring(0,1);
           System.out.println(firstLetter);
           String remainLetters = s.substring(1);
           System.out.println(remainLetters);
           String firstLetterUpperCase = firstLetter.toUpperCase();
           System.out.println(firstLetterUpperCase);
           String output = firstLetterUpperCase+remainLetters;
           System.out.println(output);
           result = result+output;
       }
       System.out.println(result);
   }
}
