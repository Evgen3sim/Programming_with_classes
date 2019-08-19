package by.epam.classesAndObjects.task10;

import java.util.Calendar;
/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
 Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
 Задать критерии выбора данных и вывести эти данные на консоль.

Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели. Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        AirLine[] airLine = new AirLine[5];

        airLine[0] = new AirLine("Mosow",666, "Boeing-747", 5,"Monday, Wednesday");
        airLine[1] = new AirLine("Minsk",785, "Boeing-767", 6,"Friday, Sunday" );
        airLine[2] = new AirLine("Kiev",345, "Boeing-727", 4,"Tuesday, Thursday");
        airLine[3] = new AirLine("Tokyo",333, "Boeing-777",12,"Monday, Wednesday");
        airLine[4] = new AirLine("Shanghai",531, "Boeing-745", 7,"Thursday, Saturday");

        for (int i = 0; i < airLine.length; i++){
            System.out.println(airLine[i].toString());
        }

        System.out.println("1. By destination");
        System.out.println("2. By day of the week");
        System.out.println("3. By the day of the week and the time is longer than specified");

        int num = scn.nextInt();

        switch (num){
            case 1:
                destibation(airLine);
                break;

            case 2:
                day(airLine);
                break;

            case 3:
            	flightByWeekDay(airLine);
                break;
        }

    }

    private static void destibation(AirLine[] airLines){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter destibation");
        String des = scn.nextLine();

        int i;

        for (i = 0; i < airLines.length; i++){
            if (airLines[i].getDestination().contains(des)){
                airLines[i].print();
            }
        }
    }

    private static void day(AirLine[] airLines){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter day");
        String day = scn.nextLine();

        int i;

        for (i = 0; i < airLines.length; i++){
            if (airLines[i].getDays_week().contains(day)){
                airLines[i].print();
            }
        }
    }

    public static void flightByWeekDay(AirLine[] airline) {
    	Scanner sc = new Scanner(System.in);
    	String day = sc.nextLine();
    	int departureTime = sc.nextInt();
    	
		if(departureTime < 0) {
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < airline.length; i++) {
			if (airline[i].getDays_week().contains(day) && airline[i].getTime() > departureTime) {
				System.out.println(airline[i].getFlight_number());
			}
		}
	}

}
