package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Teacher {
    private String lname;
    private String fname;
    private Department department;
    private String id;

    @Override
    public String toString() {
        return "Teacher{" +
                "lname='" + lname + '\'' +
                ", fname='" + fname + '\'' +
                ", department=" + department +
                ", id='" + id + '\'' +
                '}';
    }
}

