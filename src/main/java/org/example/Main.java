package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem = new SchoolManagementSystem();
        //System.out.println(schoolManagementSystem.findCourse("C001"));
        schoolManagementSystem.addDepartment("Computer Science");
        schoolManagementSystem.addDepartment("Social Science");
        schoolManagementSystem.addDepartment("Computer Technology");
        schoolManagementSystem.addDepartment("Math");
        schoolManagementSystem.addDepartment("Music");
        schoolManagementSystem.addDepartment("Game");
        System.out.println(schoolManagementSystem.findDepartment("D001"));
        schoolManagementSystem.printDepartments();
        schoolManagementSystem.printStudents();
        System.out.println(schoolManagementSystem.findDepartment("D002").toString());
        schoolManagementSystem.addStudent("Mike", " Conan","D001");
        schoolManagementSystem.addStudent("John", " Snow","D002");
        schoolManagementSystem.addTeacher("Yi", " Wang","D002");
        schoolManagementSystem.addCourse("Intro To Programming", 3.0,"D001");
        schoolManagementSystem.addCourse("Intro To Science", 3.0,"D002");
        schoolManagementSystem.addCourse("Intro To Math", 3.0,"D003");
        schoolManagementSystem.modifyCourseTeacher("T001","C002");
        schoolManagementSystem.registerCourse("S001","C001");
        schoolManagementSystem.registerCourse("S001","C002");
        schoolManagementSystem.findStudent("S001");
    }
}