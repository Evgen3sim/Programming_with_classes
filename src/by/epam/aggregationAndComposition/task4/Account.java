package by.epam.aggregationAndComposition.task4;

public class Account {

    private String name;
    private boolean lock;
    private double balance;
    private int num;

    {
        lock = true;
    }

    public Account(String name, boolean lock, double balance, int num) {
        this.name = name;
        this.lock = lock;
        this.balance = balance;
        this.num = num;
    }

    public String getAccountName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Account{ " +
                "name = '" + name + '\'' +
                ", lock = " + lock +
                ", balance = " + balance +
                ", num = " + num +
                 '}';
    }
}
