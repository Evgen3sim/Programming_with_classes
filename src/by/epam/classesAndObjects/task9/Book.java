package by.epam.classesAndObjects.task9;

/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
 Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
 Задать критерии выбора данных и вывести эти данные на консоль.

Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета. Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.*/

public class Book {

    private int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int number_pages;
    private int price;
    private String type;

     Book(int id, String name, String author, String publisher, int year, int number_pages, int price, String type) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.number_pages = number_pages;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumber_pages() {
        return number_pages;
    }

    public void setNumber_pages(int number_pages) {
        this.number_pages = number_pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    void print(){
        System.out.println(id + ", " + name + ", " + author + ", " + publisher + ", " + year + ", " + number_pages + ", " + price + ", " + type);
    }

    @Override
    public String toString() {
        return "Book{ " +
                id + ", " +
                name + ", " +
                author + ", " +
                publisher + ", " +
                year + ", " +
                number_pages + ", " +
                price + ", " +
                type + " " +
                '}';
    }
}
