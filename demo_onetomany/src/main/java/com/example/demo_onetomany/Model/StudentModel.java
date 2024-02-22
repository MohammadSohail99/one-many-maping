package com.example.demo_onetomany.Model;

import com.example.demo_onetomany.Entity.Courses;

import java.util.ArrayList;
import java.util.List;

public class StudentModel {
    private int Id;
    private String name;
    private String classname;
    private int age;
    private List<Courses> courses=new ArrayList<>();

    public StudentModel() {

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
        return "StudentModel{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", classname='" + classname + '\'' +
                ", age=" + age +
                ", courses=" + courses +
                '}';
    }
}
