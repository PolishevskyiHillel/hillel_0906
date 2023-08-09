package ua.hillel.lessons.lesson13.abstractExample;

public class CarController {

    public void aboutCar(Car car) {
        System.out.println(car.maxSpeed());;
        car.drive();
        car.brake();
    }
}
