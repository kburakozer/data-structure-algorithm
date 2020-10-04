package com.doublylinkedList;

public class Node {
    private int value;
    Node next;
    Node previous;

    public Node(int value, Node next, Node previous){
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
