package com.grade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student 
{
    private String name;
    private List<Integer> grades;

    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }
}

class StudentGradeManagementSystem {
    private ArrayList<Student> students;

    public StudentGradeManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(String name, List<Integer> grades) {
        Student student = new Student(name, grades);
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("List of students and their grades:");
            for (Student student : students) {
                System.out.println("Name: " + student.getName() + ", Grades: " + student.getGrades());
            }
        }
    }

    public void searchStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println("Name: " + student.getName() + ", Grades: " + student.getGrades());
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void calculateAverageGrade(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                List<Integer> grades = student.getGrades();
                int sum = 0;
                for (int grade : grades) {
                    sum += grade;
                }
                double average = (double) sum / grades.size();
                System.out.println("Average grade for " + student.getName() + ": " + average);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void calculateClassAverage() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            ArrayList<Integer> allGrades = new ArrayList<>();
            for (Student student : students) {
                allGrades.addAll(student.getGrades());
            }
            int sum = 0;
            for (int grade : allGrades) {
                sum += grade;
            }
            double average = (double) sum / allGrades.size();
            System.out.println("Class average grade: " + average);
        }
    }

    public void removeStudent(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                students.remove(student);
                System.out.println(student.getName() + " removed successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}






 