package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList stack;

    public Stack(){
        this.stack = new ImmutableLinkedList();
    }

    public Object peek(){
        return stack.getLast();
    }

    public Object pop(){
        Object obj = peek();
        stack = stack.removeLast();
        return obj;
    }

    public void push(Object e){
        stack = stack.addLast(e);
    }

    public String toString(){
        return stack.toString();
    }
}
