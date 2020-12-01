package com.datastructure.doublylinkedList.Tree;

public class Main {
    public static void main(String[] args) {
        BinTree tree = new BinTree();
        tree.add(15);
        tree.add(10);
        tree.add(8);
        tree.add(12);
        tree.add(17);
        tree.add(16);
        tree.add(18);
        tree.depthFirstSearch();
    }
}
