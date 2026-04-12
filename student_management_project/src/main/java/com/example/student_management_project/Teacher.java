package com.example.student_management_project;

public class Teacher {

    private int id;//unique

    private String name;

    private String subject;

    private int phoneNumber;

    public Teacher() {
    }

    public Teacher(int id, String name, String subject, int phoneNumber) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
