package com.Tree;

import com.queue.MyQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinTree {


    private BinNode root;

    public BinTree(){
        root = null;
    }

    public void add(int value){
        BinNode node = new BinNode(value);
        BinNode current = root;
        boolean cont = true;
        if(current == null){
            root = node;
        } else{
            while(cont){
                if(value <= current.getValue()){
                    if(current.getLeft() == null){
                        current.setLeft(node);
                        cont = false;
                    } else{
                        current = current.getLeft();
                    }
                } else{
                    if(current.getRight() == null){
                        current.setRight(node);
                        cont = false;
                    } else{
                        current = current.getRight();
                    }
                }
            }
        }
    }

    public BinNode getRoot() {
        return root;
    }

    public void breadthFirstSearch(){
        if(root == null){
            System.out.println("The tree is empty");
            return;
        }
        Queue<BinNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinNode current = queue.remove();
            if(current.getLeft() != null){
                queue.add(current.getLeft());
            }
            if(current.getRight() != null){
                queue.add(current.getRight());
            }
            System.out.println(current.getValue());
        }

    }

    public void depthFirstSearch(){
        if(root == null){
            System.out.println("The tree is empty");
            return;
        }
        Stack<BinNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            BinNode current = stack.pop();
            if(current.getRight() != null){
                stack.push(current.getRight());
            }

            if(current.getLeft() != null){
                stack.push(current.getLeft());
            }
            System.out.println(current.getValue());
        }

    }
}
