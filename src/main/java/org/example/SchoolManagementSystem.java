package org.example;

import java.util.Arrays;

public class SchoolManagementSystem {
    Department[] departments = new Department[5];
    Student[] students = new Student[200];
    Teacher[] teachers = new Teacher[20];
    Course[] courses = new Course[30];

    public Department findDepartment(String departmentId) {
        for (int i = 0; i < departments.length; i++) {
            Department matchedId = departments[i];
            if (matchedId.getId().matches(departmentId)) {

                return matchedId;
            }

           // System.out.println(departments[i].substring(36).replace('\'', ' ').replace(')', ' ').trim());
        }
        return null;
    }

    public void printTeachers() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
    public void printCourses() {
        for (Course course : courses) {
            System.out.println(course);
        }
    }
    public void modifyCourseTeacher(String teacherId, String courseId) {
        Course setCourse = findCourse(courseId);
        Teacher setTeacher = findTeacher(teacherId);
        if (courseId == null) {
            System.out.println("Cannot find any course match courseId" + courseId + ", modify teacher for course " + courseId + "failed.");
        }else if (teacherId == null) {
            System.out.println(" Cannot find any teacher match teacherId" + teacherId + ", modify teacher for course " + courseId + "failed.");
        }else {
            setCourse.setTeacher(setTeacher);
        }
    }
    public void addDepartment(String departmentName) {
        //String[] departments = new String[5];
        Department department = new Department(departmentName);
        //System.out.println(department.getId().charAt(3));
        if ( Character.getNumericValue(department.getId().charAt(3)) <= 5) {
            System.out.println("Add department " + department + " successfully.");
            for (int i = 0; i < departments.length; i++) {
                if ( departments[i] == null) {
                    departments[i] = department;
                    break;
                }
            }
        }
        else {
                System.out.println("Max department reached, add a new department failed.");
            }

        }
    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public Student findStudent(String studentId) {
        for (int i = 0; i < students.length; i++) {
               Student matchedId = students[i];
               if (matchedId.getId().matches(studentId)) {
                    return matchedId;
            }
        }
        return null;
    }
    public void addCourse(String courseName,double credit,String departmentId ) {
        if (findDepartment(departmentId) != null) {
            Course course = new Course(courseName, credit, findDepartment(departmentId));
            int checkTeacherId = Integer.parseInt(course.getId().replace('C', ' ').trim());
            if (checkTeacherId <= 30) {
                System.out.println(course + " successfully.");
                for (int i = 0; i < courses.length; i++) {
                    if (courses[i] == null) {
                        courses[i] = course;

                        //teacher.setCourseNum(i++);
                        break;
                    }
                }
            } else {
                System.out.println(" Max courses reached, add a new course failed. ");
            }
        }
    }
        public void registerCourse (String studentId, String courseId){
            Course registerCourse = findCourse(courseId);
            Student registerStudent = findStudent(studentId);
            if (registerCourse == null) {
                System.out.println("Cannot find any student match with studentId" + studentId  + ", register course for student" + studentId + " failed. ");
            } else if(registerStudent == null) {
                System.out.println("Cannot find any student match with courseId" + courseId + ", register course for student" + studentId + " failed.");
            } else if (registerStudent.getCourseNum() <= Course.MAX_STUDENT_NUM) {
                Student[] regstud = new Student[5];
            //    String[] strregstud = new String[5];

                for (int i = 0; i < students.length; i++) {
                    if (regstud[i] == null && students[i] != null) {
                        regstud[i] = findStudent(studentId);
              //          strregstud[i] = regstud[i].getFname() + " " + regstud[i].getLname();
                        registerCourse.setStudentNum(i);
                        break;
                    }
                }
                registerCourse.setStudents(regstud);
                System.out.println("Latest course info");
                System.out.println(findCourse(courseId).toString());

                // registerStudent.setCourses(regstud);
            }
        }

    public void addTeacher(String fname,String lname,String departmentId) {
        if (findDepartment(departmentId) != null) {
            Teacher teacher = new Teacher(fname, lname, findDepartment(departmentId));
            int checkTeacherId = Integer.parseInt(teacher.getId().replace('T',' ').trim());
            if (checkTeacherId <= 20) {
                System.out.println(teacher + " successfully.");
                for (int i = 0; i < teachers.length; i++) {
                    if (teachers[i] == null) {
                        teachers[i] = teacher;
                        //teacher.setCourseNum(i++);
                        break;
                    }
                }
            }
            else {
                System.out.println(" Max students reached, add a new student failed. ");
            }

            }
        }

    public Course findCourse(String courseId) {
        for (int i = 0; i < courses.length; i++) {
        Course matchedId = courses[i];
        if (matchedId.getId().matches(courseId)) {
            return matchedId;
        }
        }
        return null;
    }
    public void printDepartments() {
        for (Department department : departments) {
            System.out.println(department);
        }
    }
    public void addStudent(String fname, String lname, String departmentId) {
        if (findDepartment(departmentId) != null) {
            Student student = new Student(fname, lname, findDepartment(departmentId));
            int checkStudentId = Integer.parseInt(student.getId().replace('S',' ').trim());
            if (checkStudentId <= 200) {
                System.out.println(student + " successfully.");
                for (int i = 0; i < students.length; i++) {
                    if (students[i] == null) {
                        students[i] = student;
                       // student.setCourseNum;
                        break;
                    }
                }
            }
            else {
                System.out.println(" Max students reached, add a new student failed. ");
            }
        }
    }
    public Teacher findTeacher(String teacherId) {
        for (int i = 0; i < teachers.length; i++) {
            Teacher matchedId = teachers[i];
            if (matchedId.getId().matches(teacherId)) {
                return matchedId;
            }
        }
        return null;
    }
}
