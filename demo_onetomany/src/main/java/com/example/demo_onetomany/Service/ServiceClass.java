package com.example.demo_onetomany.Service;

import com.example.demo_onetomany.Entity.Courses;
import com.example.demo_onetomany.Entity.Student;
import com.example.demo_onetomany.Model.CoursesModel;
import com.example.demo_onetomany.Model.StudentModel;
import com.example.demo_onetomany.Repository.CourseRepo;
import com.example.demo_onetomany.Repository.StudentRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ServiceClass implements ServiceInterface{
    @Autowired
    public CourseRepo courseRepo;
    @Autowired
    public StudentRepo studentRepo;
    public String saveStudent(StudentModel studentModel){
        if(studentModel==null){
            return "Student not found";
        }
        else {
            Student student=new Student();
            BeanUtils.copyProperties(studentModel,student);
            studentRepo.save(student);
            return "Student saved successfully";
        }
    }

    public List<StudentModel> getAll(){

        List<Student> studentList=studentRepo.findAll();
        List<StudentModel> studentModelList=new ArrayList<>();

        studentList.forEach(student -> {
            StudentModel studentModel=new StudentModel();
            BeanUtils.copyProperties(student,studentModel);
            studentModelList.add(studentModel);
        });
        return studentModelList;
    }
    public String saveItems(CoursesModel coursesModel, int Id){
        Courses courses=new Courses();
        BeanUtils.copyProperties(coursesModel,courses);
        Optional<Student> student=studentRepo.findById(Id);
        //courses.setStudent(student.get());

        List<Courses> CourseList=new ArrayList<>();
        CourseList.add(courses);
        student.get().setCourses(CourseList);

        courses.setStudent(student.get());
        System.out.println(courses);
        studentRepo.save(student.get());

        return "Course saved Successfully";
    }

    public List<Courses> details(int id){
        System.out.println(id);
        List<Courses> courseList=courseRepo.findAll();
        List<Courses> courses1=courseList.stream().filter(i -> i.getStudent().getId() == id).collect(Collectors.toList());
        return courses1;
    }
    public void remove(int id){
        Student student=studentRepo.findById(id).orElse(null);
        if(student!=null){
            studentRepo.delete(student);
        }
    }
    public void remove1(int Cid){
        courseRepo.deleteById(Cid);
    }
    public StudentModel getStudentById(int id) {
        Optional<Student> studentOptional = studentRepo.findById(id);
        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            StudentModel studentModel = new StudentModel();
            BeanUtils.copyProperties(student, studentModel);
            return studentModel;
        }
        return null;
    }

    public String updateStudent(StudentModel studentModel) {
        Optional<Student> studentOptional = studentRepo.findById(studentModel.getId());
        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            BeanUtils.copyProperties(studentModel, student);
            studentRepo.save(student);
            return "Student updated successfully";
        }
        return "Student not found";
    }

    public CoursesModel getCourseById(int id) {
        Optional<Courses> courseOptional = courseRepo.findById(id);
        if (courseOptional.isPresent()) {
            Courses course = courseOptional.get();
            CoursesModel coursesModel = new CoursesModel();
            BeanUtils.copyProperties(course, coursesModel);
            return coursesModel;
        }
        return null;
    }

    public String updateCourse(CoursesModel coursesModel) {
        Optional<Courses> courseOptional = courseRepo.findById(coursesModel.getCid());
        if (courseOptional.isPresent()) {
            Courses course = courseOptional.get();
            BeanUtils.copyProperties(coursesModel, course);
            courseRepo.save(course);
            return "Course updated successfully";
        }
        return "Course not found";
    }

}
