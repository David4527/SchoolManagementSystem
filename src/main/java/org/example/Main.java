package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem = new SchoolManagementSystem();
        System.out.println(schoolManagementSystem.findCourse("C001"));
        schoolManagementSystem.addDepartment("Computer Science");
        schoolManagementSystem.addDepartment("Social Science");
        schoolManagementSystem.addDepartment("Computer Technology");
        schoolManagementSystem.addDepartment("math");
        schoolManagementSystem.addDepartment(" Music");
        schoolManagementSystem.addDepartment(" Game");
        schoolManagementSystem.printDepartments();
    }
}