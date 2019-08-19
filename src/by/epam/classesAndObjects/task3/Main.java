package by.epam.classesAndObjects.task3;

import java.util.Scanner;
/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа.
 Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

public class Main {
    public static void main(String[] args) {

        Student[] student = new Student[10];


        student[0] = new Student("Kabak", "E.S.", 11, 9);
        student[1] = new Student("Devichko", "N.O.", 11, 10);
        student[2] = new Student("Golubet", "V.O.", 11, 9);
        student[3] = new Student("Bektimirov", "R.P.", 11, 7);
        student[4] = new Student("Mager", "O.S.", 11, 4);
        student[5] = new Student("Baranovskaya", "S.I.", 11, 8);
        student[6] = new Student("Avdeichik", "V.S.", 11, 4);
        student[7] = new Student("Rajko", "A.O.", 11, 7);
        student[8] = new Student("Budko", "D.S.", 11, 6);
        student[9] = new Student("Kasperovich", "E.S.", 11, 9);
        getBestProgress(student);
    }


        public static void getBestProgress(Student[] student) {
            for (int i = 0; i < student.length; i++) {
                if(student[i].getProgress() == 9 || student[i].getProgress() == 10) {
                    System.out.printf("\n%15s %d",student[i].getSurname(), student[i].getNumber_group());
                }
            }
    }
}
