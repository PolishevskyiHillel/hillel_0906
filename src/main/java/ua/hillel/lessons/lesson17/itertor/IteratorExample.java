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
        List<Integer> integerList = new CopyOnWriteArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        Iterator<Integer> integerIterator = integerList.iterator();
        while (integerIterator.hasNext()) {
            Integer nextInteger = integerIterator.next();
            if (nextInteger.equals(2)) {
                integerList.add(10);
            }
            System.out.print(nextInteger + " ");
        }
        System.out.println("\n" + integerList);
    }

    static void iteratorFailFast() {
        List<Integer> integerList = new LinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        Iterator<Integer> integerIterator = integerList.iterator();
        while (integerIterator.hasNext()) {
            Integer nextInt = integerIterator.next();
            if (nextInt.equals(2)) {
                integerIterator.remove();
            }
            System.out.print(nextInt + " ");
        }
        System.out.println("\n" + integerList);
    }
}
