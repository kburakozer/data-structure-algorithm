package com.datastructure.doublylinkedList.Tree;

public class BinNode {
    private int value;
    private BinNode right;
    private BinNode left;
    public BinNode(int value){
        this.value = value;
        this.right = null;
        this.left = null;

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinNode getLeft() {
        return left;
    }

    public void setLeft(BinNode left) {
        this.left = left;
    }

    public BinNode getRight() {
        return right;
    }

    public void setRight(BinNode right) {
        this.right = right;
    }



}
