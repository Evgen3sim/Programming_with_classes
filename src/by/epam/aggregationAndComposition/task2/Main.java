package by.epam.aggregationAndComposition.task2;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.*/


public class Main {
    public static void main(String[] args) {

        Wheel[] wheel = new Wheel[4];

        wheel[0] = new Wheel(15);
        wheel[1] = new Wheel(15);
        wheel[2] = new Wheel(15);
        wheel[3] = new Wheel(15);

        Engine engine = new Engine(10);
        Car car = new Car("Lamborghini", wheel);


        car.refuel(5, engine);
        car.drive();
        car.stop();
        car.replaceWheel(12,3);
        System.out.println(car.getModel());

    }
}
