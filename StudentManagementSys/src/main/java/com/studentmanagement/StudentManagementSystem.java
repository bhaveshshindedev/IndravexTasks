package com.studentmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int choice;
        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Delete Student Record");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    students.add(new Student(id, name, marks));

                    System.out.println("Student Added Successfully.");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No Students Found.");
                    } else {
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Student s : students) {
                        if (s.getStudentId() == searchId) {
                            System.out.println(s);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    int updateId = sc.nextInt();

                    found = false;

                    for (Student s : students) {
                        if (s.getStudentId() == updateId) {

                            System.out.print("Enter New Marks: ");
                            double newMarks = sc.nextDouble();

                            s.setMarks(newMarks);

                            System.out.println("Marks Updated.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found.");
                    }

                    break;

                case 5:
                    System.out.print("Enter Student ID to Delete: ");
                    int deleteId = sc.nextInt();
                    found = false;
                    for (Student s : students) {
                        if (s.getStudentId() == deleteId) {
                            students.remove(s);
                            System.out.println("Student Deleted.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student Not Found.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        } while (choice != 6);
        sc.close();
    }
}