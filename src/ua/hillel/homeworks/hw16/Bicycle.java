package ua.hillel.homeworks.hw16;

public class Bicycle implements Vehicle {
    private String make;
    private String model;
    private int year;
    private int pedals;

    public Bicycle(String make, String model, int year, int pedals) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.pedals = pedals;
    }

    @Override
    public void start() {
        System.out.println("Поездка на велосипеде " + make + " началась. У велосипеда " + pedals + " педали.");
    }

    @Override
    public void stop() {
        System.out.println("Поездка на велосипеде " + make + " завершена.");
    }
}

