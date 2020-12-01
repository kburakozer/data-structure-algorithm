package com.datastructure.doublylinkedList.singlylinkedlist;

public class SinglyLinkedList {
    Node head;
    Node tail;

    SinglyLinkedList(){
        head = null;
        tail = null;
    }

    public void add2front(int n){
        Node node = new Node(n, head);
        if(head == null){
            head = node;
            tail = head;
        } else{
            head = node;
        }
    }

    public void add2back(int n){
        Node node = new Node(n, null);
        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
            tail.next = null;
        }

    }

    public void reverse(){
        Node previous = null;

        Node current = head; // 1

        Node nextNode = null;

        tail = current;
         while(current!= null){
            nextNode = current.next; // 2
            current.next = previous; // null
            previous = current;
            current = nextNode;     // 2

        }
        head = previous;
    }

    public void print(){
        Node current = head;
        while(current != null){
            System.out.println(current.getValue());
            current = current.next;
        }
    }
}
