package com.queue;

import com.doublylinkedList.DoublyLinkedList;

public class MyQueue {


    private DoublyLinkedList list = new DoublyLinkedList();

    public void enqueue(int n){
        list.addBack(n);
    }

    public int dequeue(){
        return  list.pop();
    }

    public int peek(){
        return list.head.getValue();
    }

    public boolean isEmpty(){
        return list.getSize() == 0;
    }

    public void clear(){
        list.clear();
    }

    public int size(){
        return list.getSize();
    }
}
