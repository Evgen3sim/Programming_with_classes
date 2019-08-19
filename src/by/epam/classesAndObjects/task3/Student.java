package by.epam.classesAndObjects.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

   private String surname;
   private String inic;
   private int number_group;
   private int progress;

   Student[] student = new Student[10];

   Student(String surname, String inic, int number_group, int progress){
       this.surname = surname;
       this.inic = inic;
       this.number_group = number_group;
       this.progress = progress;
   }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getInic() {
        return inic;
    }

    public void setInic(String inic) {
        this.inic = inic;
    }

    public int getNumber_group() {
        return number_group;
    }

    public void setNumber_group(int number_group) {
        this.number_group = number_group;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
}
