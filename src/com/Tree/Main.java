package com.Tree;

public class Main {
    public static void main(String[] args) {
        BinTree tree = new BinTree();
        tree.add(8);
        tree.add(7);
        tree.add(9);

        System.out.println(tree.getRoot().getValue());
        System.out.println(tree.getRoot().getRight().getValue());
        System.out.println(tree.getRoot().getLeft().getValue());

    }
}
