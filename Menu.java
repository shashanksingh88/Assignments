package com.miniProject;

import java.util.Scanner;

public class Menu implements IMenu {
    Scanner sc = new Scanner(System.in);
    IStudent studentService = new StudentImpl();

    @Override
    public void showMenu() {
        int choice;
        do {
            System.out.println("\n=== Welcome to JDBC ===");
            System.out.println("Student Database Menu");
            System.out.println("1. Insert a student");
            System.out.println("2. Insert multiple students");
            System.out.println("3. Update a student");
            System.out.println("4. Update multiple students");
            System.out.println("5. Delete a student");
            System.out.println("6. Delete multiple students");
            System.out.println("7. Show students");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1 : studentService.insertStudent();
                case 2 : studentService.insertMultipleStudents();
                case 3 : studentService.updateStudent();
                case 4 : studentService.updateMultipleStudents();
                case 5 : studentService.deleteStudent();
                case 6 : studentService.deleteMultipleStudents();
                case 7 : studentService.showStudents();
                case 8 : System.out.println("Exiting... Thank you!");
                default : System.out.println("Invalid choice, try again!");
            }
        } while (choice != 8);
    }
}

