package com.company;
import java.util.*;

public class Main {
    public Main(){

    }

    public static void main(String[] args) {

        int[] nums1=new int[]{1,2,3,2};
        int ans1 =sumOfUnique(nums1);
        System.out.println(ans1);

        int[] nums2=new int[]{1,1,1,1};
        int ans2 =sumOfUnique(nums2);
        System.out.println(ans2);

        int[] nums3=new int[]{1,2,3,4,5};
        int ans3 =sumOfUnique(nums3);
        System.out.println(ans3);


    }
    public static int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map;
        map = new HashMap();

        for(int i = 0; i < nums.length; ++i) {
            map.put(nums[i], (Integer)map.getOrDefault(nums[i], 0) + 1);
        }

        Iterator<Integer> itr = map.keySet().iterator();
        int sum = 0;

        while(itr.hasNext()) {
            int n = (Integer)itr.next();
            if ((Integer)map.get(n) == 1) {
                sum += n;
            }
        }

        return sum;
    }
}
