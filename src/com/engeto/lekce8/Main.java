package com.engeto.lekce8;

import java.sql.SQLOutput;

public class Main {
    private static final String OUTPUT = "Classroom.txt";

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Jan", "Novák");
        Students student1 = new Students(1,"Petr", "Svoboda", 2011, "ID001");
        Students student2 = new Students(2,"Milan", "Říha", 2010,  "ID123");
        Students student3 = new Students(3,"Jindřich", "Nový", 2012, "ID345");



        Classroom classroom = new Classroom("C", 4, teacher);

        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);



        System.out.println("####################################");
        System.out.println("Třída: " + classroom.getGrade() + "." + classroom.getName() + " (ročník: " + classroom.getGrade() + ") \n" +
                "Třídní učitel: " + teacher.getLastName() + ", " + teacher.getFirstName() + "\n" +
                "Počet studentů: " + classroom.size());

        System.out.println("\n####################################");
        classroom.getStudentsInfo();
        classroom.getClassroomInfo();

        classroom.saveToFile(OUTPUT);

    }

}
