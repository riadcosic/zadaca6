package com.qamp.Zadaca6.Task1;
import java.util.LinkedList;
import java.util.List;

public class Classroom {


    final List<Student> listOfStudents = new LinkedList<>(){};

    public Classroom() {
    }

    public void addStudent(Student student){
        listOfStudents.add(student);
    }

    public boolean isPresent(String name){
        for(Student student : listOfStudents){
            if(student.getName().equals(name)){
                return true;
            }
        } return false;
    }

    public void printClassroom(){
        for(Student student : listOfStudents){
            System.out.println(student.toString());
        }
    }



}
