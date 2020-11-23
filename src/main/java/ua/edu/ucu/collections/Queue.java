package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Queue {
    private ImmutableLinkedList queue;

    public Queue() {
        this.queue = new ImmutableLinkedList();
    }

    public Object peek() {
        return queue.getLast();
    }

    public Object dequeue() {
        Object obj = peek();
        queue = queue.removeLast();
        return obj;
    }

    public void enqueue(Object e) {
        queue = queue.addFirst(e);
    }

    public String toString() {
        return queue.toString();
    }
}
