package com.example.demo_onetomany.Model;

import com.example.demo_onetomany.Entity.Student;

public class CoursesModel {
    private int cid;
    private String cname;
    private String instructor;
    private Student student;

    public CoursesModel() {
    }

    public CoursesModel(int cid, String cname, String instructor, Student student) {
        this.cid = cid;
        this.cname = cname;
        this.instructor = instructor;
        this.student = student;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "CoursesModel{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", instructor='" + instructor + '\'' +
                ", student=" + student +
                '}';
    }
}
