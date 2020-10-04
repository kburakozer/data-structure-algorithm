package com.sorting;

public class SelectionSort {

    public void sort(int [] nums){
        int len = nums.length;
        for(int i = 0; i < len-1; i++){
            int min = nums[i];
            int min_index = i;
            for(int j= i+1; j<len; j++){
                if(nums[j] < min){
                    min = nums[j];
                    min_index = j;
                }
            }
            nums[min_index] = nums[i];
            nums[i] = min;
        }
    }
}
