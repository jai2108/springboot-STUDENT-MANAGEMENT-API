package com.example.student_management_project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Student, Integer> {

   // Student findByRollNo(int rollno);

    Student findByAge(int age);


}
