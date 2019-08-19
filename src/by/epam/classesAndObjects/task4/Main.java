package by.epam.classesAndObjects.task4;

import java.util.ArrayList;
/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте возможность сортировки
массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        Train[] train = new Train[5];


        train[0] = new Train("Minsk", 436728, 4);
        train[1] = new Train("Kiev", 123456, 8);
        train[2] = new Train("Moscow", 467283, 6);
        train[3] = new Train("Tokyo", 948274, 2);
        train[4] = new Train("Shanghai", 237564, 9);


        for (int i = 0; i < train.length; i++) {
            System.out.printf(train[i].getDestination() + " " +train[i].getNumber() + " " + train[i].getTime() + "\n");
        }

        System.out.println();
        System.out.println("1. Sorting(number)");
        System.out.println("2. Train information");
        System.out.println("3. Sorting(destination)");

        int num = scn.nextInt();

        switch (num){
            case 1:
                sortingNubmer(train);
                break;
            case 2:
                print(train);
                break;
            case 3:
                sortingDestination(train);
                break;

        }

    }


    public static void sortingNubmer(Train[] train){
       for (int i = train.length - 1; i >= 0; i -- ){
            for (int j = 0; j < i; j++){
                if (train[j].getNumber() > train[j + 1].getNumber()){
                    Train tmp = train[j];
                    train[j] = train[j + 1];
                    train[j + 1] = tmp;
                }
            }
       }

        for (int i = 0; i < train.length; i++) {
            System.out.printf(train[i].getDestination() + " " +train[i].getNumber() + " " + train[i].getTime() + "\n");
        }

    }

    public  static void print(Train[] train){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter train number");

        int num = scn.nextInt();

        for (int i = 0; i < train.length; i++){
            if (train[i].getNumber() == num){
                System.out.println("Destination: " + train[i].getDestination());
                System.out.println("Number: " + train[i].getNumber());
                System.out.println("Time: " + train[i].getTime());
            }
        }

    }

    public static void sortingDestination(Train[] train){
        for (int i = train.length - 1; i >= 0; i--){
            for (int j = 0; j < i; j ++){
                if (train[j + 1].getDestination().compareTo(train[j].getDestination()) < 0){
                    Train tmp = train[j];
                    train[j] = train[j + 1];
                    train[j + 1] = tmp;
                } else
                    if (train[j + 1].getDestination().compareTo(train[j].getDestination()) == 0){
                        if (train[j].getTime() > train[j + 1].getTime()){
                            Train tmp = train[j];
                            train[j] = train[j + 1];
                            train[j + 1] = tmp;
                        }
                    }
            }
        }
        for (int i = 0; i < train.length; i++) {
            System.out.printf(train[i].getDestination() + " " +train[i].getNumber() + " " + train[i].getTime() + "\n");
        }
    }
}