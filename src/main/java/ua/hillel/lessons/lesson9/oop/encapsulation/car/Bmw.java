package ua.hillel.lessons.lesson9.oop.encapsulation.car;

import ua.hillel.lessons.lesson9.oop.encapsulation.specific.Specification;

public class Bmw {
    public static void main(String[] args) {
        Specification specification = new Specification();
        specification.setFuel("Diesel");
        specification.chooseCar();
    }
}
