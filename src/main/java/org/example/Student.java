package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
    public Student(String fname,String lname, Department department ) {
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        this.id = String.format("S03%d" + nextId++);
    }
}
