package ua.edu.ucu.collections;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    Stack stack;
    @Before
    public void setUP() {
        this.stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(150.5);
    }

    @Test
    public void testPush() {
        assertEquals(150.5, stack.peek());
        stack.push(15);
        assertEquals(15, stack.peek());
    }

    @Test
    public void testPop() {
        assertEquals(150.5, stack.pop());
        assertEquals(30, stack.peek());
    }

    @Test
    public void testPeek() {
        assertEquals(150.5, stack.peek());
    }
    
}
