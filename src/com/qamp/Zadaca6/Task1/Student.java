package com.qamp.Zadaca6.Task1;

public class Student {

    final private String nameOfStudent;
    final private int ageofStudent;

    public Student(String name) {
        this.nameOfStudent = name;
        this.ageofStudent = 15;
    }

    public Student(String name, int age) {
        this.nameOfStudent = name;
        this.ageofStudent = age;
    }

    public String getName() {
        return this.nameOfStudent;
    }

    public int getAge() {
        return this.ageofStudent;
    }

    public String toString(){
        return this.nameOfStudent + "," + this.ageofStudent;
    }
}
