package by.epam.classesAndObjects.task1;

/*Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
 Добавьте метод, который находит сумму значений этих переменных,
 и метод, который находит наибольшее значение из этих двух переменных.*/

public class Main {
    public static void main(String[] args) {

        Test1 test1 = new Test1();
        test1.pri();
        test1.ren(18, 10);
        test1.pri();
        System.out.println("Summa " + test1.sum());
        System.out.println("Bolchee " + test1.bol());

    }
}
