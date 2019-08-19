package by.epam.aggregationAndComposition.task5;

/* Туристические путевки. Сформировать набор предложений клиенту по выбору
   туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.)
   для оптимального выбора. Учитывать возможность выбора транспорта, питания и числа дней.
   Реализовать выбор и сортировку путевок. */

public class Main {

    public static void main(String[] args) {

        TouristAgency touristAgency = new TouristAgency("Dream&Fly");
        touristAgency.addClient(new Client("Evgeny"));
        touristAgency.getClientByName("Evgeny").addTour(new Tour("Rest", "Car", true, 12));
        touristAgency.getClientByName("Evgeny").addTour(new Tour("Excursion", "Bus", false, 7));
        touristAgency.getClientByName("Evgeny").addTour(new Tour("Shopping", "On foot", true, 2));

        for (int i = 0; i < touristAgency.getClientByName("Evgeny").getTours().length; i++) {
            System.out.println(touristAgency.getClientByName("Evgeny").getTours()[i]);
        }

        touristAgency.getClientByName("Evgeny").sort();

        System.out.println();
        for (int i = 0; i < touristAgency.getClientByName("Evgeny").getTours().length; i++) {
            System.out.println(touristAgency.getClientByName("Evgeny").getTours()[i]);
        }

    }
}
