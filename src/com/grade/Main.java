package com.grade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        StudentGradeManagementSystem system = new StudentGradeManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Grade Management System ---");
            System.out.println("1. Add a new student");
            System.out.println("2. Display all students");
            System.out.println("3. Search for a student by name");
            System.out.println("4. Calculate average grade of a student");
            System.out.println("5. Calculate class average grade");
            System.out.println("6. Remove a student");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student grades (comma-separated): ");
                    String gradesInput = scanner.nextLine();
                    String[] gradesArray = gradesInput.split(",");
                    List<Integer> grades = new ArrayList<>();
                    for (String grade : gradesArray) {
                        grades.add(Integer.parseInt(grade.trim()));
                    }
                    system.addStudent(name, grades);
                    break;
                case 2:
                    system.displayStudents();
                    break;
                case 3:
                    System.out.print("Enter student name: ");
                    String searchName = scanner.nextLine();
                    system.searchStudentByName(searchName);
                    break;
                case 4:
                    System.out.print("Enter student name: ");
                    String avgName = scanner.nextLine();
                    system.calculateAverageGrade(avgName);
                    break;
                case 5:
                    system.calculateClassAverage();
                    break;
                case 6:
                    System.out.print("Enter student name: ");
                    String removeName = scanner.nextLine();
                    system.removeStudent(removeName);
                    break;
                case 7:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}