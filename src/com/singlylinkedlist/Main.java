package com.singlylinkedlist;

public class Main {
    public static void main(String [] args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add2front(4);
        list.add2front(3);
        list.add2front(2);
        list.add2front(1);

        list.reverse();
        list.print();

    }
}
