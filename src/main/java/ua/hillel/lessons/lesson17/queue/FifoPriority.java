package ua.hillel.lessons.lesson17.queue;

import java.util.LinkedList;
import java.util.Queue;

public class FifoPriority {
    static Queue<Integer> integerQueueintegerQueue = new LinkedList<>();

    public static void main(String[] args) {
        linkedListQueueAdd();
        linkedListQueueIsEmpty();
    }

    static void linkedListQueueIsEmpty() {
        while (!integerQueueintegerQueue.isEmpty()) {
            System.out.print(integerQueueintegerQueue.poll() + " ");
        }
    }

    static void linkedListQueuePeek() {
        while (integerQueueintegerQueue.peek() != null) {
            System.out.print(integerQueueintegerQueue.poll() + " ");
        }
    }

    static void linkedListQueueAdd() {
        integerQueueintegerQueue.add(1);
        integerQueueintegerQueue.add(2);
        integerQueueintegerQueue.add(3);
        integerQueueintegerQueue.add(4);
    }
}
