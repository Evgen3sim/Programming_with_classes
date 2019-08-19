package by.epam.classesAndObjects.task8;

/*Создать класс Customer, спецификация которого приведена ниже.
Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 Задать критерии выбора данных и вывести эти данные на консоль.


Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        Customer[] customer = new Customer[5];

        int i;

        customer[0] = new Customer(1, "Kabak", "Evgeny", "Sergeevich", "Derugo", 463785764, 3452);
        customer[1] = new Customer(2, "Baranovskaya", "Sabina", "Iosifovna", "Yubileynaya", 284058375, 3453);
        customer[2] = new Customer(3, "Yankovsky", "Sergey", "Olegovich", "Sinickogo", 2048574955, 3434);
        customer[3] = new Customer(4, "Kovshik", "Dasha", "Vladimirovna", "Oktyaborskaya", 583095035, 323);
        customer[4] = new Customer(5, "Kamyak", "Alex", "Sergeevich", "Kaminskogo", 485930485, 6752);

     /*   System.out.println("Sorted alphabetically: ");
        char alph[]={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        for (int x=0; x<alph.length; x++)
        {for (i=0; i<customer.length; i++)
        {
            if (customer[i].getSurname().charAt(0)==alph[x])
                customer[i].print();
        }
        }*/
      // sort(customer);

        for (i = 0; i < customer.length; i++){
            System.out.println(customer[i].toString());
        }

        System.out.println("1. Sort by Name");
        System.out.println("2. Display cards in a given range");

        int num = scn.nextInt();

        switch (num){
            case 1: sort(customer);
            break;

            case 2:
                display(customer);
                break;

        }

    }

    private static void sort(Customer[] customers) {
        char alph[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        int i;

        for (int x = 0; x < alph.length; x++) {
            for (i = 0; i < customers.length; i++) {
                if (customers[i].getName().charAt(0) == alph[x])
                    customers[i].print();
            }
        }
    }

    private  static void display(Customer[] customers){
        Scanner scn = new Scanner(System.in);
        System.out.println("The first number must be less than the second!!!");
        System.out.println("Enter a nine-digit number(1)");
        int num1 = scn.nextInt();
        System.out.println("Enter a nine-digit number(2)");
        int num2 = scn.nextInt();
        if (num1 < num2) {
            for (int i = 0; i < customers.length; i++) {
                if (customers[i].getCard_number() >= num1 && customers[i].getCard_number() <= num2) {
                    customers[i].print();
                }
            }
        }
        else {
            System.out.println("The first number is greater than the second");
        };
    }
}
