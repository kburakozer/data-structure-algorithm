package com.sorting;

public class QuickSort {

    public void sort(int [] array, int s, int e){
        if(s>e){
            return;
        }
        int pivot = array[s];
        int left = s+1;
        int right = e;

        while(left <= right) {
            while (pivot > array[left] && left < e) {
                left++;
            }
            while (array[right] > pivot && right > s) {
                right--;
            }
            if (left >= right) {
                break;
            } else {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
        int tmp = pivot;
        array[s] = array[right];
        array[right] = tmp;
        sort(array, s, right-1);
        sort(array, right+1, e);
    }
}
