package com.doublylinkedList;

public class DoublyLinkedList {
    public Node head;
    public Node tail;
    private int size = 0;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public void addFront(int n) {
        Node node = new Node(n, head, null);
        if (head == null) {
            head = node;
            tail = head;
            setSize(size + 1);
        } else {
            head.previous = node;
            head = node;
            setSize(size + 1);
        }
    }

    public void addBack(int n) {
        Node node = new Node(n, null, tail);
        if (head == null) {
            head = node;
            tail = head;
            setSize(size + 1);
        } else {
            tail.next = node;
            tail = node;
            setSize(size + 1);
        }
    }

    public boolean isEmpty(Node n) {
        if (n == null) {
            return true;
        } else {
            return false;
        }
    }

    public int pop() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty!");
        } else {
            head = head.next;
            setSize(size - 1);
            return current.getValue();
        }
        return 0;
    }

    public void remove(int n){
        Node current = head;
        Node temp = current.next;
        if(head.getValue() == n){
            head = head.next;
            return;
        }
        while(current != null){

            if(temp.getValue() == n){
                current.next = temp.next;
                return;
            } else{
                current = current.next;
            }
        }
    }

    public void print() {
        Node current = head;
        while (!isEmpty(current)) {
            System.out.println(current.getValue());
            current = current.next;
        }
    }

    public void clear() {
        Node current = head;
        while (current != null) {
            head = head.next;
            current = current.next;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


}
