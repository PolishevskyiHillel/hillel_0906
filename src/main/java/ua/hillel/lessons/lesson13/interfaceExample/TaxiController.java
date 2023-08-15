package ua.hillel.lessons.lesson13.interfaceExample;

public class TaxiController {

    public void aboutTaxiCar(Car car){
        System.out.println("in this car ");
        car.passengerPlaces();
        car.pricePerKillometr();
        car.getPassenger();
        car.passengerPay();
    }

}
