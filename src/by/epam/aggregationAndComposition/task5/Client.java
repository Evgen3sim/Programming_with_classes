package by.epam.aggregationAndComposition.task5;

/* Туристические путевки. Сформировать набор предложений клиенту по выбору
   туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.)
   для оптимального выбора. Учитывать возможность выбора транспорта, питания и числа дней.
   Реализовать выбор и сортировку путевок. */

import java.util.Arrays;

public class Client {

    public String name;
    public Tour[] tours;

    {
        tours = new Tour[3];
    }

    public Client(String name) {
        this.name = name;
    }

    public void addTour(Tour tour) {
        if (tour != null) {
            for (int i = 0; i < tours.length; i++) {
                if (tours[i] == null) {
                    tours[i] = tour;
                    break;
                }
            }
        }
    }

    public void removeTour(Tour tour) {
        if (tour != null) {
            for (int i = 0; i < tours.length; i++) {
                if (tours[i] != null && tours[i].equals(tour)) {
                    tours[i] = null;
                    break;
                }
            }
        }
    }

    public Tour getTourByType(String type) {
        Tour tour = null;
        if (type != null) {
            for (int i = 0; i < tours.length; i++) {
                if (tours[i].getTourName().equals(type)) {
                    tour = tours[i];
                    break;
                }
            }
        }
        return tour;
    }

    public void sort() {
        for (int i = tours.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (tours[j + 1].getTourName().compareTo(tours[j].getTourName()) < 0) {
                    Tour tmp = tours[j];
                    tours[j] = tours[j + 1];
                    tours[j + 1] = tmp;
                }
            }
        }
    }

    public Tour[] getTours() {
        return tours;
    }

    public String getClientByName() {
        return name;
    }

    @Override
    public String toString() {
        return "Client{" +
                " name='" + name + '\'' +
                ", tours=" + Arrays.toString(tours) +
                '}';
    }
}
