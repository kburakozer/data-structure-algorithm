package com.Tree;

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
}
