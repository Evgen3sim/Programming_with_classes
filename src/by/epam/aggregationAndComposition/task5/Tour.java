package by.epam.aggregationAndComposition.task5;

/* Туристические путевки. Сформировать набор предложений клиенту по выбору
   туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.)
   для оптимального выбора. Учитывать возможность выбора транспорта, питания и числа дней.
   Реализовать выбор и сортировку путевок. */

public class Tour {

    private String name;
    private String transport;
    private boolean nutrition;
    private int numberOfDays;

    public Tour(String name, String transport, boolean nutrition, int numberOfDays) {
        this.name = name;
        this.transport = transport;
        this.nutrition = nutrition;
        this.numberOfDays = numberOfDays;
    }

    public String getTourName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public void setNutrition(boolean nutrition) {
        this.nutrition = nutrition;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "name='" + name + '\'' +
                ", transport='" + transport + '\'' +
                ", nutrition=" + nutrition +
                ", numberOfDays=" + numberOfDays +
                '}';
    }
}
