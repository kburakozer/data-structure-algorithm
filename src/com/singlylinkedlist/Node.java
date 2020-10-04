package com.singlylinkedlist;

public class Node {
    private int value;
    public Node next;

    Node(int value, Node next){
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

