package by.epam.classesAndObjects.task6;

import java.util.Scanner;

/*Составьте описание класса для представления времени.
Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда)
 с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0.
 Создать методы изменения времени на заданное количество часов, минут и секунд.*/

public class Time {

    Scanner scn = new Scanner(System.in);

    public int hour;
    public int min;
    public int sec;


    public int insH(){
        System.out.println("Enter hours: ");
        int x = scn.nextInt();
        if (x > 24 || x < 0){
            System.out.println("Incorrect value");
         // x = insH();
            x = 0;
        }
        return x;
    }

    public int insM(){
        System.out.println("Enter minutes: ");
        int x = scn.nextInt();
        if (x > 60 || x < 0){
            System.out.println("Incorrect value");
           // x = insH();
            x = 0;
        }
        return x;
    }

    public int insS(){
        System.out.println("Enter seconds: ");
        int x = scn.nextInt();
        if (x > 60 || x < 0){
            System.out.println("Incorrect value");
           // x = insH();
            x = 0;
        }
        return x;
    }

   /* void Print(Time m){
        System.out.println(insH() + " : " + insM() + " : "+ insS());
        choose(m);

    }*/

    public void choose(Time m){
        Scanner scn = new Scanner(System.in);
        System.out.println("Do you want to change something?" + "  Yes " + "or" + " No ");

        String test = scn.nextLine();
        String yes = "Yes";

        if (test.equals(yes)){
            System.out.println("What do you want to change? (hour, min, sec)");
            String s = scn.nextLine();
            if (s.equals("hour")){
                changeH(m);
            }
            else{
                if (s.equals("min")){
                    changeM(m);
                }else {
                    if (s.equals("sec")){
                        changeS(m);
                    }
                }
            }

            System.out.println("Do you want to change something else? (Yes/No)");
            String answer2 = scn.nextLine();
            if (answer2.equals("Yes")){
                choose(m);
            }else {
                System.out.println("Result: " );
            }
        }
    }

    public void changeH(Time m){
        System.out.println("Enter the hour you want to change: ");
        int change = scn.nextInt();
        if (change > 24 || change < 0){
            System.out.println("The value will be out of range when changing, repeat input");
            changeH(m);
        }
        else {
            m.hour = change;
            System.out.println(hour + ":" + min + ":" + sec);
        }
    }

    public void changeM(Time m){
        System.out.println("Enter the minutes you want to change: ");
        int change = scn.nextInt();
        if (change > 60 || change < 0){
            System.out.println("The value will be out of range when changing, repeat input");
            changeM(m);
        }
        else {
            m.min = change;
            System.out.println(hour + ":" + min + ":" + sec);
        }
    }

    public void changeS(Time m){
        System.out.println("Enter the seconds you want to change: ");
        int change = scn.nextInt();
        if (change > 60 || change < 0){
            System.out.println("The value will be out of range when changing, repeat input");
            changeS(m);
        }
        else {
            m.sec = change;
            System.out.println(hour + ":" + min + ":" + sec);
        }
    }



}




