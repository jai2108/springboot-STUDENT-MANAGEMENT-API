package com.example.student_management_project;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    HashMap<Integer,Teacher> teacherDb = new HashMap<>();
  /*  @PostMapping("/add")
    public String addTeacher(@RequestBody Teacher teacher){
        int key = teacher.getId();
        teacherDb.put(key,teacher);

        return "data saved successfully";

    }*/
}
