package ua.hillel.lessons.lesson16.set;

import java.util.HashSet;

public class SetExample {

    static HashSet<Integer> myHashSet = new HashSet<>();

    public static void main(String[] args) {
        addMethod();
        sizeMethod();
        isContainsMethod();
    }

    static void isEmptyMethod() {
        System.out.println("Does myHashSet empty: " + myHashSet.isEmpty());
    }

    static void clearMethod() {
        myHashSet.clear();
    }

    static void sizeMethod() {
        System.out.println("myHashSet size: " + myHashSet.size ());
    }

    static void isContainsMethod() {
        System.out.println("Does myHashSet contains: " + myHashSet.contains(1));
        System.out.println("Does myHashSet contains: " + myHashSet.contains(100));
    }

    static void removeMethod() {
        System.out.println("Before removing");
        for (Integer i : myHashSet) {
            System.out.print(i + " ");
        }
        myHashSet.remove(1);
        System.out.println();
        System.out.println("After removing");
        for (Integer i : myHashSet) {
            System.out.print(i + " ");
        }
    }

    static void addMethod() {
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(2);
        myHashSet.add(3);
        for (Integer i : myHashSet) {
            System.out.println(i);
        }
    }
}
