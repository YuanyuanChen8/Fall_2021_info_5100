
package com.company;

import java.util.HashMap;

class SumOfsubarray {


    public int subarraySum(int[] nums, int k) {
        if (nums.length == 1) {
            if (nums[0] == k)
                return 1;

            return 0;
        }

        for (int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];

        HashMap<Integer, Integer> hm = new HashMap<>();

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k)
                count++;

            if (hm.containsKey(nums[i] - k))
                count += hm.get(nums[i] - k);

            if (!hm.containsKey(nums[i]))
                hm.put(nums[i], 1);
            else
                hm.put(nums[i], hm.get(nums[i]) + 1);

        }

        return count;
    }
}