package com.java.access.specifiers;

import com.java.Student;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

public class Student2 extends Student{

    public int id=20;

    public static void main(String[] args) {
        Student2 student2 = new Student2();
        student2.method4();
    }

    public void method21() {
        Student student= new Student();
        int id=student.id;
//        String name=student.name;
//        String grade=student.grade;
        String studentGrade = grade;
//        String course = student.course;
        String name = student.method1();
    }

    public void method4(){
        System.out.println(id);
        System.out.println(super.id);
    }

}