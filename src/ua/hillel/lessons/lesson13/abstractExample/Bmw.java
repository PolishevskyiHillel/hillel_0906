package ua.hillel.lessons.lesson13.abstractExample;

public class Bmw extends Car{

    @Override
    String maxSpeed() {
        return "300";
    }

    @Override
    void drive() {
        System.out.println("Bmw drive ");
    }

    @Override
    void brake() {
        System.out.println("Bmw break ");
    }

    @Override
    void repair() {

    }
}
