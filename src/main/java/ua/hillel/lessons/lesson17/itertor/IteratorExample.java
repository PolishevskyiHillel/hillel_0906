package ua.hillel.lessons.lesson17.itertor;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorExample {
    public static void main(String[] args) {
        iteratorFailSafe();
    }

    static void iteratorFailSafe() {
        List<Integer> integersList = new CopyOnWriteArrayList<>();
        integersList.add(1);
        integersList.add(2);
        integersList.add(3);
        integersList.add(4);
        integersList.add(5);

        Iterator<Integer> integerIterator = integersList.iterator();
        while (integerIterator.hasNext()) {
            Integer nextInteger = integerIterator.next();
            if (nextInteger.equals(2)) {
                integersList.add(10);
            }
            System.out.print(nextInteger + " ");
        }
        System.out.println("\n" + integersList);
    }

    static void iteratorFailFast() {
        List<Integer> integersList = new LinkedList<>();
        integersList.add(1);
        integersList.add(2);
        integersList.add(3);
        integersList.add(4);
        integersList.add(5);

        Iterator<Integer> integerIterator = integersList.iterator();
        while (integerIterator.hasNext()) {
            Integer nextInteger = integerIterator.next();
            if (nextInteger.equals(2)) {
                integerIterator.remove();
            }
            System.out.print(nextInteger + " ");
        }
        System.out.println("\n" + integersList);
    }
}