package com.studentmanagement;

class Student {
    private int studentId;
    private String studentName;
    private double marks;

    public Student(int studentId, String studentName, double marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "ID: " + studentId +
                " | Name: " + studentName +
                " | Marks: " + marks;
    }
}
