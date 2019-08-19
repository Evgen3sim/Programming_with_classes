package by.epam.aggregationAndComposition.task4;

/*Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
 Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.*/

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("BeralusBank");
        bank.addClient(new Client("Evgeny"));

        bank.getClientByName("Evgeny").addAccount(new Account("Papich",true ,666, 6532));
        bank.getClientByName("Evgeny").addAccount(new Account("Roflan", true,999, 1235));
        bank.getClientByName("Evgeny").addAccount(new Account("Vitalina",false,-124, 9876));

        System.out.println(bank.getClientByName("Evgeny").getAccountByName("Papich"));
        System.out.println(bank.getClientByName("Evgeny").getAccountByName("Roflan"));
        System.out.println(bank.getClientByName("Evgeny").getAccountByName("Vitalina"));

        System.out.println();
        bank.getClientByName("Evgeny").sort();
        System.out.println();
        bank.getClientByName("Evgeny").find("Papich");
        System.out.println();
        bank.getClientByName("Evgeny").sum();
        bank.getClientByName("Evgeny").positiveSum();
        bank.getClientByName("Evgeny").negativeSum();


    }
}
