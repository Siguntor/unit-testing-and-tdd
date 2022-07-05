package com.acme.banking.dbo.domain;

public class SavingAccount implements Account {
    private int id;
    private Client client;
    private double amount;

    public SavingAccount(int id, Client client, double amount) {

        if (id == 0 || id < 0) throw new IllegalArgumentException("ID = 0 or < 0");
        if (client == null) throw new IllegalArgumentException("Client is null or empty");
        if (amount == 0 || amount < 0) throw new IllegalArgumentException("Amount = 0 or < 0");

        this.id = id;
        this.client = client;
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Client getClient() {
        return client;
    }
}
