package ua.hillel.lessons.lesson17.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Fifo {
    static Queue<Integer> integerQueue = new LinkedList<>();


    public static void main(String[] args) {
        linkedListQueueAdd();
        show();
        linkedListQueuePeek();
        show();
    }

    static void linkedListQueueElement() {
        System.out.println(integerQueue.element() + "\n");
    }

    static void linkedListQueuePeek() {
        System.out.println(integerQueue.peek() + "\n");
    }

    static void linkedListQueueOffer() {
        integerQueue.offer(1);
    }

    static void linkedListQueuePoll() {
        integerQueue.poll();
    }

    static void linkedListQueueRemove() {
        integerQueue.remove();
    }

    static void linkedListQueueAdd() {
        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(3);
        integerQueue.add(4);
    }

    static void show() {
        for (Integer i : integerQueue) {
            System.out.println("\n");
        }
    }
}
