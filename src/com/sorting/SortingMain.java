package com.sorting;

public class SortingMain {
    public static void main(String [] args){
        int [] nums = {5,3,6,1,7,8};
//        QuickSort sort = new QuickSort();
//        sort.sort(nums, 0, nums.length-1);
//        for(int i: nums){
//            System.out.println(i);

//        BubbleSort sort = new BubbleSort();
//        sort.sort(nums);
//        for(int i : nums){
//            System.out.println(i);
//        }

//        InsertionSort sort = new InsertionSort();
//        sort.sort(nums);
//        for(int i : nums){
//            System.out.println(i);
//        }

//        SelectionSort sort = new SelectionSort();
//        sort.sort(nums);
//        for(int i : nums){
//            System.out.println(i);
//        }

        MergeSort sort = new MergeSort();
        int []result = sort.mergeSort(nums);
        for(int i : result){
            System.out.println(i);
        }
    }
}
