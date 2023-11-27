package org.example;

public class SchoolManagementSystem {
    String[] departments = new String[5];

    public Department findDepartment(String departmentId) {
    return null;
    }
    public void printTeachers() {

    }
    public void modifyCourseTeacher(String teacherId, String courseId) {

    }
    public void addDepartment(String departmentName) {
        //String[] departments = new String[5];
        Department department = new Department(departmentName);
        //System.out.println(department.getId().charAt(3));
        if ( Character.getNumericValue(department.getId().charAt(3)) <= 5) {
            System.out.println("Add department Department(id=" + department.getId() + ", departmentName=" + "'" + departmentName + "')" + " successfully.");
            for (int i = 0; i < departments.length; i++) {
                if ( departments[i] == null) {
                    departments[i] = departmentName;
                    break;
                }
            }
        }
        else {
                System.out.println("Max department reached, add a new department failed.");
            }
        }
    public void printStudents() {

    }
    public Student findStudent(String studentId) {
        return null;
    }
    public void addCourse(String courseName,double credit,String id ) {

    }
    public  void registerCourse(String studentId,String courseId) {

    }
    public void addTeacher(String fname,String lname,String id) {

    }
    public Course findCourse(String courseId) {
        return null;
    }
    public void printDepartments() {
        for (String department : departments) {
            System.out.println(department);
        }
    }
    public void addStudent(String fname, String lname, String id) {

    }
    public Teacher findTeacher(String teacherId) {
        return null;
    }
}
