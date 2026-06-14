package com.empdierctory;

class Student1 {

    int id;
    String name;

    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Student1 s = (Student1) obj;

        return id == s.id && name.equals(s.name);
    }
}

public class Task5Override {
    public static void main(String[] args) {

        Student1 s1 = new Student1(1, "Bhavesh");
        Student1 s2 = new Student1(1, "Bhavesh");

        System.out.println("Using == : " + (s1 == s2));
        System.out.println("Using equals(): " + s1.equals(s2));
    }
}