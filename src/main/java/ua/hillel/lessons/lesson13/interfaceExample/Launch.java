package ua.hillel.lessons.lesson13.interfaceExample;

public class Launch {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        TaxiController taxiController = new TaxiController();
        taxiController.aboutTaxiCar(toyota);
    }
}
