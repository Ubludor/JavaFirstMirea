package ru.mirea.task12.sort1;

public class Students {
    public String gender;
    public int iDNumber;

    public Students(String gender, int iDNumber) {
        this.gender = gender;
        this.iDNumber = iDNumber;
    }

    public String getGender() {
        return gender;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }
}
