package ua.hillel.homeworks.hm18;

public class Launch {
    public static void main(String[] args) {
        Client individual = new Individual(5000);
        Client legalEntity = new LegalEntity(10000);
        Client entrepreneur = new IndividualEntrepreneur(5000);

        individual.deposit(1000);
        individual.withdraw(500);
        individual.about();
        System.out.println();

        legalEntity.deposit(2000);
        legalEntity.withdraw(1000);
        legalEntity.about();
        System.out.println();

        entrepreneur.deposit(500);
        entrepreneur.withdraw(2000);
        entrepreneur.about();
    }
}