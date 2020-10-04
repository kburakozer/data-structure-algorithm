package com.sorting;

public class InsertionSort {

    public void sort(int [] array){
        int len = array.length;

        for(int i=0; i<len-1; i++){
            for(int j = i+1; j>0; j--){
                if(array[j] < array[j-1]){
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }
        }
    }
}
