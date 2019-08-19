package by.epam.aggregationAndComposition.task4;

public class Bank {

    private String name;
    private Client[] clients;

    {
        clients = new Client[4];
    }

    public Bank(String name) {
        this.name = name;
    }

    public void addClient(Client client){
        if (client != null){
            for (int i = 0; i < clients.length; i++){
                if (clients[i] == null){
                    clients[i] = client;
                    break;
                }
            }
        }
    }

    public void removeClient(Client client){
        if (client != null){
            for (int i = 0; i < clients.length; i++){
                if (clients[i] != null && clients[i].equals(client)){
                    clients[i] = null;
                    break;
                }
            }
        }
    }

    public Client getClientByName(String name){
        Client client = null;
        if (name != null){
            for (int i = 0; i < clients.length; i++){
                if (clients[i].getClientName().equals(name)){
                    client = clients[i];
                    break;
                }
            }
        }
        return client;
    }

    public String getBankName() {
        return name;
    }
}
