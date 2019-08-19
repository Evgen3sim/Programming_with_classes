package by.epam.aggregationAndComposition.task4;

import java.util.Arrays;

public class Client {

    private String name;
    private Account[] accounts;

    {
        accounts = new Account[3];
    }

    public Client(String name) {
        this.name = name;
    }

    public void sort(){
        for (int i = accounts.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (accounts[j].getNum() > accounts[j + 1].getNum()) {
                    Account tmp = accounts[j];
                    accounts[j] = accounts[j + 1];
                    accounts[j + 1] = tmp;
                }
            }
            System.out.println(accounts[i].toString());
        }
    }

    public void find(String name){
        for (int i = 0; i < accounts.length; i++){
            if (name == accounts[i].getAccountName()){
                System.out.println("Account found");
            }
        }
    }

    public void addAccount(Account account){
        if (account != null){
            for (int i = 0; i < accounts.length; i++){
                if (accounts[i] == null){
                    accounts[i] = account;
                    break;
                }
            }
        }
    }

    public void sum(){
        double sum = 0;
        for (int i = 0; i < accounts.length; i++){
             sum += accounts[i].getBalance();
        }
        System.out.println("Sum of all accounts " + sum);
    }

    public void positiveSum(){
        double sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getBalance() > 0) {
                sum += accounts[i].getBalance();
            }
        }
        System.out.println("Positive account " + sum);
    }

    public void negativeSum(){
        double sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getBalance() < 0) {
                sum += accounts[i].getBalance();
            }
        }
        System.out.println("Negative account " + sum);
    }

    public void removeAccount(Account account){
        if (account != null){
            for (int i = 0; i < accounts.length; i++){
                if (accounts[i] != null && accounts[i].equals(account)){
                    accounts[i] = null;
                    break;
                }
            }
        }
    }

    public Account getAccountByName(String name){
        Account account = null;
        if (name != null){
            for (int i = 0; i < accounts.length; i++){
                if (accounts[i].getAccountName().equals(name)){
                    account = accounts[i];
                    break;
                }
            }
        }
        return account;
    }

    public String getClientName() {
        return name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
