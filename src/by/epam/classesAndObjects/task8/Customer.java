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

public class Customer {

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private int card_number;
    private int bank_account_number;

    Customer[] customer = new Customer[5];


   Customer(int id, String surname, String  name, String patronymic, String address, int card_number, int bank_account_number){
       this.id = id;
       this.surname = surname;
       this.name = name;
       this.patronymic = patronymic;
       this.address = address;
       this.card_number = card_number;
       this.bank_account_number = bank_account_number;
   }


    public Customer[] getCustomer() {
        return customer;
    }

    public void setCustomer(Customer[] customer) {
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCard_number() {
        return card_number;
    }

    public void setCard_number(int card_number) {
        this.card_number = card_number;
    }

    public int getBank_account_number() {
        return bank_account_number;
    }

    public void setBank_account_number(int bank_account_number) {
        this.bank_account_number = bank_account_number;
    }

    void print ()
    {
        System.out.println (id+"\t"+surname+"\t"+name+"\t"+patronymic+"\t"+address+"\t"+address+"\t"+card_number+"\t"+bank_account_number);
    }



    @Override
    public String toString() {
        return "Customer{ " +
                + id + " " +
                surname + " " +
                name  + " " +
                patronymic  + " " +
                address  + " " +
                card_number + " " +
                bank_account_number + " " +
                '}';
    }


}
