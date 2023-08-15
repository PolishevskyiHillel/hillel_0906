package ua.hillel.lessons.lesson9.oop.encapsulation.specific;

public class Specification {
    private String fuel;

    private String type;

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void chooseCar() {
        if (this.fuel.equals("Diesel")) {
            System.out.println("Renault");
        } else {
            System.out.println("Skoda");
        }
    }
}
