package com.example.demo_onetomany.Service;

import com.example.demo_onetomany.Model.CoursesModel;
import com.example.demo_onetomany.Model.StudentModel;

import java.util.List;

public interface ServiceInterface{
    public String saveStudent(StudentModel studentModel);
    public  List<StudentModel> getAll();
    public String saveItems(CoursesModel coursesModel, int Id);
}
