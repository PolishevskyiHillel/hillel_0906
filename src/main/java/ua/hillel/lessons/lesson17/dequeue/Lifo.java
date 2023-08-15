package ua.hillel.lessons.lesson17.dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class Lifo {

    static Deque<Integer> dequeList = new LinkedList<>();

    public static void main(String[] args) {
        linkedListDequeuePush();
        linkedListDequeuePop();
    }

    static void linkedListDequeuePop() {
        while (!dequeList.isEmpty()) {
            System.out.print(dequeList.poll() + " ");
        }
    }

    static void linkedListDequeuePush() {
        dequeList.add(1);
        dequeList.add(2);
        dequeList.add(3);
        dequeList.add(4);
    }
}
