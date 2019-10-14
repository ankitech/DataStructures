package com.ankitech.arrays;

class ReverseArray {

    static int[] reverse(int[] nums){

        if(nums.length == 0){
            return nums;
        }

        int startIndex = 0;
        int endIndex = nums.length-1;

        while(endIndex > startIndex){
            nums = swap(nums, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }
        return nums;
    }

    private static int[] swap(int[] nums, int startIndex, int endIndex) {

        int temp = nums[startIndex];
        nums[startIndex] = nums[endIndex];
        nums[endIndex] = temp;

        return nums;
    }
}
