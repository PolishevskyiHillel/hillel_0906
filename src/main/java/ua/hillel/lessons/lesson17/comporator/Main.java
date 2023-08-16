package ua.hillel.lessons.lesson17.comporator;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Car> carsTreeSet = new TreeSet<>(new CarModelComparator().reversed());
        carsTreeSet.add(new Car("BMW", 2012));
        carsTreeSet.add(new Car("Honda", 2008));
        carsTreeSet.add(new Car("Tesla", 2018));
        carsTreeSet.add(new Car("Lincoln", 2006));
        carsTreeSet.add(new Car("Toyota", 2017));

        for (Object o : carsTreeSet) {
            System.out.println(o);
        }
    }
}
