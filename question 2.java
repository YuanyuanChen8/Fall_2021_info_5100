package com.company;

import java.util.Arrays;

public class Main {
    public Main(){

    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{-4,-1,0,3,10};
        int[] ans1 = sortedSquares(nums1);
        System.out.println(ans1);

        int[] nums2 = new int[]{-7,-3,2,3,11};
        int[] ans2 = sortedSquares(nums2);
        System.out.println(ans2);
    }

        public static int[] sortedSquares(int[] nums) {
            int[] ans = new int[nums.length];
            for (int i = 0; i < nums.length; ++i){
                ans[i] = nums[i]* nums[i];
            }
            Arrays.sort(ans);
            return ans;

        }
}

