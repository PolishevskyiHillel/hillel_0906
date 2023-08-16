package ua.hillel.lessons.lesson17.comporator;

import java.util.Comparator;

public class CarModelComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getModel().compareTo(o2.getModel());
    }
}
