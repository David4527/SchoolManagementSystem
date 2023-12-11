/**
 * Author:David Adesina
 */
package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
@Getter
@Setter
public class Course {
    public static final int MAX_STUDENT_NUM = 5;
    private double credit;
    private String id;
    private Student[] students;
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;
    private static int nextid = 1;
    public Course(String courseName, double credit, Department department) {
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
        this.id = String.format("C%03d", nextid++);
    }
    @Override
    public String toString() {
        ArrayList<String> mystudents = new ArrayList<>();
        if (students != null) {
            for (Student student : students) {
                if (student != null) {
                    String mystudentName = student.getFname() + " " + student.getLname();
                    mystudents.add(mystudentName);
                }
            }
        }
        return "Course{" +
                "id='" + id + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credit=" + credit +
                ", teacher=" + teacher +
                ", department='" + department.getDepartmentName() +
                "', students=" + mystudents + " " +
                '}';
    }
}
