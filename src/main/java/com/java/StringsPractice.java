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

   @Test
    public void getLength(){
        String s1 = "Hiii";
        Integer s2 = s1.length();
       System.out.println(s2);
   }

   @Test
    public void task1(){
       String s1 = "hello";
       String s2 = "world";
       Integer lengthOfString1 = s1.length();
       Integer lengthOfString2 = s2.length();
       Integer x = lengthOfString1+lengthOfString2;
       System.out.println(x);
       int b = s1.compareTo(s2);
       if(b == 0){
           System.out.println("equal");
       }else if(b > 0){
           System.out.println("yes");
       }else if(b < 0){
           System.out.println("no");
       }


       String firstLetterIns1 = s1.substring(0,1);
       String upperCaseFors1 = firstLetterIns1.toUpperCase();
       String remainLettersIns1 = s1.substring(1);
       String out = upperCaseFors1+remainLettersIns1;
       String firstLetterIns2 = s2.substring(0,1);
       String upperCaseFors2 = firstLetterIns2.toUpperCase();
       String remainLettersIns2 = s2.substring(1);
       String out1 = upperCaseFors2+remainLettersIns2;
       String result = out+ " "+ out1;
       System.out.println(result);
   }
   }
