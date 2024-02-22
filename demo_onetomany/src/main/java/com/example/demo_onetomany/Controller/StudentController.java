package com.example.demo_onetomany.Controller;

import com.example.demo_onetomany.Entity.Courses;
import com.example.demo_onetomany.Entity.Student;
import com.example.demo_onetomany.Model.CoursesModel;
import com.example.demo_onetomany.Model.StudentModel;
import com.example.demo_onetomany.Service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    public ServiceClass serviceClass;
    public int Id=0;
    @RequestMapping(" ")
    public String start(){
        return "start";
    }
    @GetMapping("/addStudent")
    public String addStudent(Model model){
        StudentModel studentModel=new StudentModel();
        model.addAttribute("studentModel",studentModel);
        return "addStudent";
    }
    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("studentModel") StudentModel studentModel,Model model){
        System.out.println(studentModel);
        model.addAttribute("message",serviceClass.saveStudent(studentModel));
        List<StudentModel> studentList=serviceClass.getAll();
        model.addAttribute("studentList",studentList);
        return "addCourses";
    }
    @GetMapping("/viewStudent")
    public String viewStudent(Model model){
        model.addAttribute("studentList",serviceClass.getAll());
        return "addCourses";
    }
    @GetMapping("/AddCourses")
    public String addCourses(@RequestParam("Id") int Id, Model model){
        this.Id=Id;
        CoursesModel coursesModel=new CoursesModel();
        model.addAttribute("coursesModel",coursesModel);
        return "addyourCourse";
    }
    @PostMapping("/saveCourse")
    public String saveItems(@ModelAttribute("coursesModel") CoursesModel coursesModel,Model model){
        model.addAttribute("message",serviceClass.saveItems(coursesModel,Id));
        return "redirect:/viewCourses";
    }
    @GetMapping("/viewCourses")
    public String viewcourses(Model model){
        List<Courses> CoursesList = serviceClass.details(this.Id);
        model.addAttribute("CoursesList",CoursesList);
        return "studentcourse";
    }
    @RequestMapping("/ViewCourses")
    public String viewcourses(@RequestParam("Id")int id,Model model){
        List<Courses> coursesList=serviceClass.details(id);
        model.addAttribute("CoursesList",coursesList);
        return "studentcourse";
    }
    @RequestMapping("/DeleteStudent")
    public String deletestudent(@RequestParam("Id")int id,Model model){
        serviceClass.remove(id);
        return "redirect:/viewStudent";
    }

    @RequestMapping("/DeleteCourse")
    public String deletecourse(@RequestParam("Cid")int Cid,Model model){
        System.out.println("123w:- /"+Cid);
        serviceClass.remove1(Cid);
        return "redirect:/viewStudent";
    }
    @GetMapping("/UpdateStudent")
    public String updateStudent(@RequestParam("Id") int id, Model model){
        StudentModel studentModel = serviceClass.getStudentById(id);
        model.addAttribute("studentModel", studentModel);
        return "UpdateStudent";
    }

    @PostMapping("/saveUpdatedStudent")
    public String saveUpdatedStudent(@ModelAttribute("studentModel") StudentModel studentModel, Model model){
        serviceClass.updateStudent(studentModel);
        return "redirect:/viewStudent";
    }

    @GetMapping("/UpdateCourse")
    public String updateCourse(@RequestParam("Cid") int Cid, Model model){
        CoursesModel coursesModel = serviceClass.getCourseById(Cid);
        model.addAttribute("coursesModel", coursesModel);
        return "UpdateCourse";
    }

    @PostMapping("/saveUpdatedCourse")
    public String saveUpdatedCourse(@ModelAttribute("coursesModel") CoursesModel coursesModel, Model model){
        serviceClass.updateCourse(coursesModel);
        return "redirect:/viewStudent";
    }

}
