package com.example.demo_onetomany.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    private Integer Id;
    private String name;
    private String classname;
    private int age;
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Courses> courses=new ArrayList<>();


    public Student() {
    }

    public Student(int id, String name, String classname, int age, List<Courses> courses) {
        Id = id;
        this.name = name;
        this.classname = classname;
        this.age = age;
        this.courses = courses;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", classname='" + classname + '\'' +
                ", age=" + age +
                '}';
    }
}
