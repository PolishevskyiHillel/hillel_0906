package ua.hillel.lessons.lesson13.interfaceExample;

public class Bmw implements Car {
    @Override
    public void passengerPlaces() {
        System.out.println("4 places ");
    }

    @Override
    public void pricePerKillometr() {
        System.out.println("price per kil");
    }

    @Override
    public void getPassenger() {
        System.out.println("get passenger ");
    }

    @Override
    public void passengerPay() {
        System.out.println(" passenger pay ");
    }
}
