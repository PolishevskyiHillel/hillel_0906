package ua.hillel.homeworks.hm18;

public class Individual extends Client {
    public Individual(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public void about() {
        System.out.println("Физическое Лицо");
        System.out.println("Условие депозита: Без комиссии");
        System.out.println("Условие вывода средств: Без комиссии");
        System.out.println("Баланс: " + balance);
    }
}