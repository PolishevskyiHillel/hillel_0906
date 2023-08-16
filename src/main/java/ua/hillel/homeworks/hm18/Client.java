package ua.hillel.homeworks.hm18;

public abstract class Client {
    protected double balance;

    public Client(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public abstract void about();
}