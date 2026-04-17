package com.example.student_management_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    public StudentService(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    @Autowired
    StudentsRepository studentsRepository;

    public String addStudent(Student student){

        studentsRepository.save(student);
        String mes = "student created";
        return mes;



    }

    public List<Student> getStudentInfo() {
        List<Student> list = studentsRepository.findAll();
        return list;
    }

    public Student getStudentByRollNo(int rollno){
      Student student =  studentsRepository.findByAge(rollno);
        return student;
    }

    /*public ArrayList<Student> getListOfStudent(int age) {


        ArrayList<Student> list = studentRepository.getListOfStudent();
        for (Student s : list) {
            if (s.getAge() > age) {
                list.add(s);
            }
        }


        return list;

    }*/

    /*public Student updateStudentDetails(int rolno,int phNo) {

       // logic -> old -> new phone
        // old -> db -> hashmp
        Student s = studentRepository.updateStudentDetails(rolno);

            // int oldNumber =  s.getPhoneNumber();
             s.setPhoneNumber(phNo);
             return s;

    }*/
}
