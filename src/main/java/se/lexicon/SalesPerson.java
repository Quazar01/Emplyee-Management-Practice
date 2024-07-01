package se.lexicon;

import java.time.LocalDate;
import java.util.Arrays;

public class SalesPerson extends Employee {
    private String[] clients = new String[10];
    private int acquiredClients = 0;

    // Constructor
    public SalesPerson(String name, String[] clients) {
        super(name, LocalDate.now());
        setClients(clients);
        this.calculateSalary();
    }

    // Helper methods.
    public void setClients(String[] clients) {
        System.arraycopy(clients, 0, this.clients, 0, clients.length);
    }

    // Getters and Setters
    public String[] getClients() {
        int clientsCount = getArrayCount(clients);

        String[] existingClients = new String[clientsCount];
        for (int i = 0; i < clientsCount; i++) {
            if (clients[i] != null){
                existingClients[i] = clients[i];
            }
        }
        return existingClients;
    }
    public int getAcquiredClients() {
        return acquiredClients;
    }

    // Methods.
    public void acquireClient(String client){
        if (acquiredClients < clients.length){
            for (int i = 0; i < clients.length; i++){
                if (clients[i] == null){
                    clients[i] = client;
                    acquiredClients++;
                    break;
                }
            }
            calculateSalary();
        }
        else {
            System.out.println("Client list is full, can't add more clients!");
        }
    }

    public void removeClient(String client){
        // We don't need to decrement acquiredClients here, because acquiredClients is the number of clients acquired.
        int clientCount = getArrayCount(clients);
        if (clientCount > 0){
            for (int i = 0; i < clients.length; i++){
                if (clients[i] != null && clients[i].equalsIgnoreCase(client)){
                    clients[i] = null;
                    break;
                }
            }
            calculateSalary();
        }
        else {
            System.out.println("Client list is empty, can't remove clients!");
        }
    }

    @Override
    public void calculateSalary() {
        double baseSalary = getBaseSalary();
        int clientCount = getArrayCount(clients);
        double updatedSalary = baseSalary + (acquiredClients * 1000) + (clientCount * 500);
        setSalary(updatedSalary);
    }

    @Override
    public String toString() {

        return "Id: " + getId() + "\nName: " + getName() + "\nSalary: " + getSalary() +
                "\nHiring Date: " + getDateHired() + "\nNumber of Clients Acquired: " + getAcquiredClients() +
                "\nClients: " + Arrays.toString(getClients());
    }
}
