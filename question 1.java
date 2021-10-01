package com.company;
import java.util.*;

public class Main {
    public Main(){

    }
    static int res=Integer.MAX_VALUE;
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] nums=new int[]{1,2};
        //int[] x=new int[]{2,1,6,4,8};
        //int[] y=new int[]{2,3,5,4};
        int ans =sumOfUnique(nums);
        System.out.println(ans);

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
