package com.company;

public class Q3 {


    public void moveZeroes(int[] nums){
        int index = 0;
        for(int i = 0;i < nums.length;i++){
            int now = nums[i];
            if (now != 0) {
                if (index < 0) {
                    continue;
                }
                int temp = nums[index];
                nums[index++] = now;
                nums[i] = temp;

            } else {
                if (index < 0) {
                    index = 1;
                }

            }
        }

    }

}

//283