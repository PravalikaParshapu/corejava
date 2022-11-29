package com.java;

import org.junit.Test;

import java.util.Arrays;

public class ArraysPractice {

    @Test
    public void declareIntArray(){
        int i=10;
        int[] array1 = new int[10];
        char[] array2 = new char[10];
        float[] array3 = new float[10];
        double[] array4 = new double[10];
        String[] array5 = new String[10];
        Student[] array6 = new Student[10];
    }

    @Test
    public void initializeArray(){
        int[] array1 = new int[10];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        int[] array2 = {1,2,3,4};
    }

    @Test
    public void printArray(){
        int[] array1 = {1,2,3,4};
        System.out.println(array1);
        for(int i : array1){
            System.out.println(i);
        }
        String str = Arrays.toString(array1);
        System.out.println(str);
        String[] strArray = {"a", "b", "c"};
    }
}
