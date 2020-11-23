package ua.edu.ucu.collections.immutable;

public class Node {
    private Node next;
    private Object value;

    public Node getNext() {
        return next;
    }

    public void setNext(Node nextNode) {
        this.next = nextNode;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object valueNode) {
        this.value = valueNode;
    }
}
