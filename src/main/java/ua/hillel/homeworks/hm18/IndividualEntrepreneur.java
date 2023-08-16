package ua.hillel.homeworks.hm18;

public class IndividualEntrepreneur extends Client {
    public IndividualEntrepreneur(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount < 1000) {
            balance += amount * 0.99;
        } else if (amount >= 1000) {
            balance += amount * 0.995;
        }
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public void about() {
        System.out.println("Индивидуальный Предприниматель");
        System.out.println("Условие депозита: 1% комиссии при сумме < 1000");
        System.out.println("Условие депозита: 0,5% комиссии, если сумма >= 1000");
        System.out.println("Условие вывода средств: Без комиссии");
        System.out.println("Баланс: " + balance);
    }
}