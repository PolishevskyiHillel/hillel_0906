package ua.hillel.lessons.lesson13.abstractExample;

public class Honda extends Car {
    @Override
    String maxSpeed() {
        return "200";
    }

    @Override
    void drive() {
        System.out.println("Honda drive ");
    }

    @Override
    void brake() {
        System.out.println("Honda break ");
    }

    @Override
    void repair() {

    }
}
