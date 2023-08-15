package ua.hillel.homeworks.hw16;

public class Car implements Vehicle {
    private String make;
    private String model;
    private int year;
    private int doors;

    public Car(String make, String model, int year, int doors) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.doors = doors;
    }

    @Override
    public void start() {
        System.out.println("Двигатель автомобиля " + make + " запущен. У авто " + doors + " двери!");
    }

    @Override
    public void stop() {
        System.out.println("Двигатель автомобиля " + make + " остановлен.");
    }
}

