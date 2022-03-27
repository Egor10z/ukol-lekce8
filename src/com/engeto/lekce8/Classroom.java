package com.engeto.lekce8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;

public class Classroom implements InterfaceClassroom{

    private String name;
    private int grade;
    private Teacher teacher;

    public Classroom(String name, int grade, Teacher teacher) {
        this.name = name;
        this.grade = grade;
        this.teacher = teacher;
    }

    ArrayList<Students> students = new ArrayList();

    public void addStudent(Students student){
        students.add(student);
    }

    public int size(){
        return students.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


    public void getStudentsInfo() {
        for (Students student : students) {
            System.out.println("#" + student.getNum() + "# " + student.getiD() + " - " + student.getFirstName() + " " + student.getLastName()
                    + " (" + student.getBirthyear() + ")" );

        }
    }


    public void getClassroomInfo() {
        System.out.println("\n" + getGrade() + "." + getName() + ", " + teacher.getFirstName() + " " + teacher.getLastName() );
        for (Students student : students) {
            System.out.println(student.getiD()+ ", " + student.getFirstName() + " " + student.getLastName());
        }
    }

    public void saveToFile(String output) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(output))) {
            writer.println("####################################");
            writer.println("Třída: " + getGrade() + "." + getName() + " (ročník: " + getGrade() + ") \n" +
                    "Třídní učitel: " + teacher.getLastName() + ", " + teacher.getFirstName() + "\n" +
                    "Počet studentů: " + students.size());

            writer.println("\n####################################");
            for (Students student : students) {
                writer.println("#" + student.getNum() + "# " + student.getiD() + " - " + student.getFirstName() + " " + student.getLastName()
                        + " (" + student.getBirthyear() + ")");}
            writer.println("\n" + getGrade() + "." + getName() + ", " + teacher.getFirstName() + " " + teacher.getLastName());

            for (Students student : students){
                    writer.println(student.getiD() + ", " + student.getFirstName() + " " + student.getLastName());

                }

            }
        catch (IOException e) {
            e.printStackTrace();
        }}
    }

