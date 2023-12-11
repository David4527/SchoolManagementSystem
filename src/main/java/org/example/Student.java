/**
 * Author:David Adesina
 */
package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;

@ToString
@Getter
@Setter
public class Student {
    public static final int MAX_COURSE_NUM = 5;
    private String fname;
    private Course[] courses;
    private String id;
    private int courseNum;
    private static int nextId = 1;
    private String lname;
    private Department department;
    public Student(String fname,String lname, Department department) {
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        this.id = String.format("S%03d", nextId++);
        this.courses = new Course [MAX_COURSE_NUM];
        this.courseNum = 0;
        //this.courseNum = nextId - 2;
    }

    @Override
    public String toString() {
        ArrayList<String> mycourses = new ArrayList<>();
        if (courses != null) {
            for (Course course : courses) {
                if (course != null) {
                    String mystudentName = course.getCourseName();
                    mycourses.add(mystudentName);
                }
            }
        }
        return "Student{" +
                "id='" + id + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", department=" + department +
                ", courseNum=" + courseNum +
                ", courses=" + mycourses +
                '}';
    }
}
