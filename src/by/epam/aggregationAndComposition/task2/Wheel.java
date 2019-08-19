package by.epam.aggregationAndComposition.task2;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.*/

public class Wheel {

    private int diam;

    public Wheel(int diam) {
        this.diam = diam;
    }

    public int getDiam() {
        return diam;
    }

    public void setDiam(int diam){
        this.diam += diam;
    }
}
