package by.epam.aggregationAndComposition.task2;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.*/

public class Engine {

    private int fuel;

    public int getFuel() {
        return fuel;
    }

    public Engine(int fuel) {
        this.fuel = fuel;
    }

    public void addFuel(int fuel){
       this.fuel += fuel;
    }
}
