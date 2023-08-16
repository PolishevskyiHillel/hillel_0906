package ua.hillel.homeworks.hm18;

public abstract class Client {
    private double balance;

    public Client(double initialBalance) {
        balance = initialBalance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public abstract void about();
}