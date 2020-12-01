package com.datastructure.doublylinkedList.stack;

import com.datastructure.doublylinkedList.doublylinkedlist.DoublyLinkedList;

public class MyStack {
    private DoublyLinkedList list = new DoublyLinkedList();
    // it pushes the new node to the stack
    public void push(int n){
        list.addFront(n);
    }
    // it returns the last element in the stack and deletes it
    public int pop(){
        return list.pop();
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
