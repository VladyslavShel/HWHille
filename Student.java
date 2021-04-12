package com.company;

public class Student {
    private String id;
    private String surname;
    private String name;
    private String middleName;
    private int year;
    private String adress;

    public Student(String id, String surname, String name, String middleName, int year, String adress, String phoneNumber, String faculty, String course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.year = year;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(){

    }

    @Override
    public String toString() {
        return "Class{" +
                "id='" + id + '\'' +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", year=" + year +
                ", adress='" + adress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    private String phoneNumber;
    private String faculty;
    private String course;
    private String group;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}

