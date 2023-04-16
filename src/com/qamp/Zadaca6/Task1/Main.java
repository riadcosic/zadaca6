package com.qamp.Zadaca6.Task1;

public class Main {

    public static void main(String[] args) {
        Classroom classroom = new Classroom();

        Student student1 = new Student("Riad");
        Student student2 = new Student("Nermin",17);
        Student student3 = new Student("Jasmin",15);

        classroom.addStudent(student1);
        classroom.addStudent(student2);

        boolean attendanceStudent3 = classroom.isPresent("Riad");
        System.out.println("Is Riad present? "+ attendanceStudent3);

        boolean attendanceStudent1 = classroom.isPresent("Jasmin");
        System.out.println("Is Jasmin present? "+ attendanceStudent1);

        boolean attendanceStudent2 = classroom.isPresent("Nermin");
        System.out.println("Is Nermin present? "+ attendanceStudent2);

        classroom.printClassroom();
    }
}
