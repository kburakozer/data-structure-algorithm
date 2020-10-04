package com.queue;

public class QueueMain {
    public static void main(String [] args) {

        MyQueue queue = new MyQueue();
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
    }
}
