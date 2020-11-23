package ua.edu.ucu.collections;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
    Queue queue;
    @Before
    public void setUP() {
        this.queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(150.5);
    }

    @Test
    public void testEnqueue() {
        queue.enqueue(15);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertEquals(15, queue.peek());
    }

    @Test
    public void testDequeue() {
        queue.dequeue();
        assertEquals(20, queue.peek());
    }

    @Test
    public void testPeek() {
        assertEquals(10, queue.peek());
    }
}
