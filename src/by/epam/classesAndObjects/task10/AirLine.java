package by.epam.classesAndObjects.task10;

/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
 Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
 Задать критерии выбора данных и вывести эти данные на консоль.

Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели. Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

public class AirLine {

    private String destination;
    private int flight_number;
    private  String aircraft_type;
    private  int time;
    private String days_week;

    public AirLine(String destination, int flight_number, String aircraft_type, int time, String days_week) {
        this.destination = destination;
        this.flight_number = flight_number;
        this.aircraft_type = aircraft_type;
        this.time = time;
        this.days_week = days_week;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(int flight_number) {
        this.flight_number = flight_number;
    }

    public String getAircraft_type() {
        return aircraft_type;
    }

    public void setAircraft_type(String aircraft_type) {
        this.aircraft_type = aircraft_type;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDays_week() {
        return days_week;
    }

    public void setDays_week(String days_week) {
        this.days_week = days_week;
    }

    void print(){
        System.out.println(destination + ", " + flight_number + ", " + aircraft_type + ", " + time + ", " + days_week);
    }

    @Override
    public String toString() {
        return "AirLine{ " +
                "destination='" + destination + '\'' +
                ", flight_number=" + flight_number +
                ", aircraft_type='" + aircraft_type + '\'' +
                ", time='" + time + '\'' +
                ", days_week='" + days_week +
                '}';
    }
}
