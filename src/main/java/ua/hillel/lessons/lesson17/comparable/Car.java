package ua.hillel.lessons.lesson17.comparable;

public class Car implements Comparable<Car> {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return o.model.compareTo(this.model);
    }

//    @Override
//    public int compareTo(@NotNull Car o) {
//        if (this.year == o.year) {
//            return 0;
//        } else if (this.year < o.year) {
//            return 1;
//        } else {
//            return -1;
//        }
//    }
}
