package com.engeto.lekce8;

public class Students extends Teacher {
    int num;
    int birthyear;
    String iD;


    public Students(int num, String firstName, String lastName, int birthyear, String iD) {
        super(firstName,lastName);
        this.num = num;
        this.birthyear = birthyear;
        this.iD = iD;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }
}
