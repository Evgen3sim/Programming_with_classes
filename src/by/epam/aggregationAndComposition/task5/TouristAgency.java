package by.epam.aggregationAndComposition.task5;

/* Туристические путевки. Сформировать набор предложений клиенту по выбору
   туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.)
   для оптимального выбора. Учитывать возможность выбора транспорта, питания и числа дней.
   Реализовать выбор и сортировку путевок. */

import java.util.Arrays;

public class TouristAgency {

    public String name;
    public Client[] clients;

    {
        clients = new Client[3];
    }


    public TouristAgency(String name) {
        this.name = name;
    }

    public void addClient(Client client) {
        if (client != null) {
            for (int i = 0; i < clients.length; i++) {
                if (clients[i] == null) {
                    clients[i] = client;
                    break;
                }
            }
        }
    }

    public void removeClient(Client client) {
        if (client != null) {
            for (int i = 0; i < clients.length; i++) {
                if (clients[i] != null && clients[i].equals(client)) {
                    clients[i] = null;
                    break;
                }
            }
        }
    }

    public Client getClientByName(String name) {
        Client client = null;
        if (name != null) {
            for (int i = 0; i < clients.length; i++) {
                if (clients[i].getClientByName().equals(name)) {
                    client = clients[i];
                    break;
                }
            }
        }
        return client;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TouristAgency{" +
                " name='" + name + '\'' +
                ", clients=" + Arrays.toString(clients) +
                '}';
    }
}
