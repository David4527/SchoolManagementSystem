package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@ToString
@Getter
@Setter
public class Student {
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
        this.courseNum = nextId - 2;
    }
    @Override
    public String toString() {
        return "Student{" +
                ", id='" + id + '\'' +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", department=" + department +
                ", courseNum=" + courseNum +
                ", courses=[]" + Arrays.toString(courses) +
                '}';
    }
}
