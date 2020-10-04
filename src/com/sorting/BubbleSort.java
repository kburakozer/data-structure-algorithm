package com.sorting;

public class BubbleSort {
    public void sort(int [] array){
        int len = array.length;
        for(int i=0; i <len; i++){
            for(int j=1; j < len; j++){
                if(array[j-1] > array[j]){
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }
        }
    }
}
