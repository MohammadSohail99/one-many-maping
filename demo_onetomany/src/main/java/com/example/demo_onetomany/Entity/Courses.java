package com.example.demo_onetomany.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

public class Courses {
    @Id
    private Integer cid;
    private String cname;
    private String instructor;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Courses() {
    }

    public Courses(int cid, String cname, String instructor, Student student) {
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
        return "Courses{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", instructor='" + instructor + '\'' +
                '}';
    }
}
