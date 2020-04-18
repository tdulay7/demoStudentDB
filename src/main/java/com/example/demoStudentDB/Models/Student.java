package com.example.demoStudentDB.Models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
    @Id
    int id;
    @Column
    String fname;
    @Column
    String lname;
    @Column
    int age;

    public int getId() {
        return id;     }

    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age='" + age + '\'' +'}';     }

    public void setId(int id) {
        this.id = id;     }

    public void setFname(String fname) {
        this.fname = fname;     }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setLname(String lname) {
        this.lname = lname;     }

    public String getFname() {
        return fname;     }

    public String getLname() {
        return lname;     }

    public Student(int id, String fname, String lname, int age) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.age = age; } }