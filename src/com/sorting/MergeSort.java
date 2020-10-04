package com.sorting;

public class MergeSort {

    public int [] mergeSort(int [] nums){
        if(nums.length == 1){
            return nums;
        }
        int [] left;
        int [] right;
        int midPoint;
        if(nums.length%2 == 0){
            left = new int[(nums.length/2)];
            right = new int[nums.length/2];
            midPoint = nums.length/2;
        } else{
            left = new int[(nums.length/2) + 1];
            right = new int[nums.length/2];
            midPoint = (nums.length/2) + 1;
        }

        for(int i=0; i<midPoint; i++){
            left[i] = nums[i];
        }
        for(int j=0; j<right.length; j++){
            right[j] = nums[midPoint+j];
        }

        int [] result = new int[nums.length];
        left = mergeSort(left);
        right = mergeSort(right);
        result = merge(left, right);
        return  result;
    }

    public int [] merge(int [] left, int [] right){
        int [] result = new int[left.length + right.length];
        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;

        while(leftPointer<left.length || rightPointer <right.length){
            if(leftPointer<left.length && rightPointer<right.length){
                if(left[leftPointer] < right[rightPointer]){
                    result[resultPointer] = left[leftPointer];
                    leftPointer++;
                    resultPointer++;
                } else{
                    result[resultPointer] = right[rightPointer];
                    rightPointer++;
                    resultPointer++;
                }
            } else{
                if(leftPointer >= left.length){
                    result[resultPointer] = right[rightPointer];
                    rightPointer++;
                    resultPointer++;
                }else{
                    result[resultPointer] = left[leftPointer];
                    leftPointer++;
                    resultPointer++;
                }

            }


        }
        return result;
    }
}
