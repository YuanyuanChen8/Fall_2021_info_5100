package com.company;

public class Main {
    public Main(){

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2};
        int[] ans = sortedSquares(nums);
        System.out.println(ans);

    }

        public static int[] sortedSquares(int[] nums) {

            int low=0,high=nums.length-1,k=nums.length-1;
            int arr[] = new int[nums.length];

            while(low<=high)
            {
                if(Math.abs(nums[low])>=Math.abs(nums[high]))
                {
                    arr[k] = nums[low]*nums[low];
                    low++;
                }
                else{
                    arr[k] = nums[high]*nums[high];
                    high--;
                }
                k-=1;
            }
            return arr;

        }
}

