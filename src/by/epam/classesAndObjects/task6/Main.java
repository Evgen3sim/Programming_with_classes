package by.epam.classesAndObjects.task6;

/*Составьте описание класса для представления времени.
Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда)
 с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0.
 Создать методы изменения времени на заданное количество часов, минут и секунд.*/

public class Main {
    public static void main(String[] args) {
        Time time = new Time();
        input(time);
        output(time);
        time.choose(time);
        output(time);

    }

    static void input(Time time){

        time.hour = time.insH();
        time.min = time.insM();
        time.sec = time.insS();

    }

    static  void  output(Time time){
        System.out.println(time.hour + ":" + time.min + ":" + time.sec);
    }
}
