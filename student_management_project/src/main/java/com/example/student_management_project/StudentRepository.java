package com.example.student_management_project;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;

//dB operation
@Repository
public class StudentRepository {

    HashMap<Integer, Student> studentDb = new HashMap<>();

    public ArrayList<Student> getListOfStudent() {
        ArrayList<Student> list = new ArrayList<>();// to create student List
        for (Student s : studentDb.values()) { // returen set(student)
            list.add(s);
        }

        return list;

    }// db -> list of student obj get from DB - hashmap

    public Student getStudentInfoPathvarible(int rollNo) {
        Student student = studentDb.get(rollNo);//rep
        return student;
    }
    public Student updateStudentDetails(int rollNo) {

        Student s = studentDb.get(rollNo);

        return s;


    }

}
