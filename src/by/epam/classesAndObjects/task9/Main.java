package by.epam.classesAndObjects.task9;

/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
 Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
 Задать критерии выбора данных и вывести эти данные на консоль.

Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета. Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num;

        Book[] book = new Book[5];

        book[0] = new Book(1,"Harry Poter", "Joanne Rowling", "Bloomsbury Publishing", 1997, 223, 100,"case binding");
        book[1] = new Book(2,"Harry Poter and the Golblet of fire", "Joanne Rowling", "Bloomsbury Publishing", 2000, 674, 350,"case binding");
        book[2] = new Book(3,"Coraline", "Neil Gaiman", "HarperCollins", 2012, 208, 100,"perfect binding");
        book[3] = new Book(4,"City of bones ", "Cassandra Clare", "First Edition first Printing edition", 2007, 496, 300,"case binding");
        book[4] = new Book(5,"Bridge to Terabithia", "Katherine Paterson", "HarperCollins", 2017, 144, 120,"perfect bindiNg");

        for (int i = 0; i < book.length; i++){
            System.out.println(book[i].toString());
        }

        System.out.println("1. Books by a specific author");
        System.out.println("2. Books of a particular publisher");
        System.out.println("3. Books after a certain year");

        num = scn.nextInt();

        switch (num){
            case 1:
            author(book);
                break;
            case 2:
            publisher(book);
                break;
            case 3:
            year(book);
                break;
        }

    }

    private static void author(Book[] book){

        Scanner scn = new Scanner(System.in);

        System.out.println("First and last name with a capital letter");
        System.out.println("Enter author");

        String name = scn.nextLine();

        int i;

        for (i = 0; i < book.length; i++){
            if (book[i].getAuthor().contains(name)){
                book[i].print();
            }
        }

    }

    private static void publisher(Book[] book){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter publisher");

        String publisher = scn.nextLine();

        int i;

        for (i = 0; i < book.length; i++){
            if (book[i].getPublisher().contains(publisher)){
                book[i].print();
            }
        }
    }

    private static void year(Book[] book){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter year");

        int year = scn.nextInt();

        int i;

        for (i = 0; i < book.length; i++){
            if(book[i].getYear() > year){
                book[i].print();
            }
        }
    }
}
