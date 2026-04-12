package com.example.student_management_project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// API define
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
           return studentService.addStudent(student);


    }

    @GetMapping("/getStudentlist")
    public List<Student> getStudentInfo() {
        List<Student> studentList = studentService.getStudentInfo();
        return studentList;
    }
    /*@GetMapping("/getInfoPathvarible/{rollno}")
    public Student getStudentInfoPathvarible(@PathVariable("rollno") int rollNo) {
      StudentRepository studentRepository = new StudentRepository();
       Student student = studentRepository.getStudentInfoPathvarible(rollNo);
       return  student;
    }*/

   /* @GetMapping("/getAgeGreater")
    public ArrayList<Student> getListOfStudent(@RequestParam("age") int age) {
        ArrayList<Student> students = studentService.getListOfStudent(age);
        return students;

    }

    // update - put
    @PutMapping("/updatestudentDetails")
    public Student updateStudentDetails(@RequestParam("rollNo") int rollNo, @RequestParam("newPhoneNumber") int newPhoneNumber) {
        // req -> diff layerer -> service
     Student student =   studentService.updateStudentDetails(rollNo,newPhoneNumber);//
        return student;

    }*/

   /* @DeleteMapping("/deleteStudent")
    public String deleteStudent(@RequestParam("rollno") int rollNo) {
        studentDb.remove(rollNo);

        return "student deleted successfully";

    }*/


    // delete - delete


}
