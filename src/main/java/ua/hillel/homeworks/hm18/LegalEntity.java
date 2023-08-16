package ua.hillel.homeworks.hm18;

public class LegalEntity extends Client {
    public LegalEntity(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount * 1.01;
    }

    @Override
    public void about() {
        System.out.println("Юридическое лицо");
        System.out.println("Условие депозита: Без комиссии");
        System.out.println("Условие вывода средств: 1% комиссии");
        System.out.println("Баланс: " + balance);
    }
}