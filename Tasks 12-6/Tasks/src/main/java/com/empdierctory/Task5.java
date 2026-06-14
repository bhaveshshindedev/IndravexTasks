package com.empdierctory;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Task5 {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Bhavesh");
        Student s2 = new Student(1, "Bhavesh");

        System.out.println("Using == : " + (s1 == s2));
        System.out.println("Using equals(): " + s1.equals(s2));
    }
}