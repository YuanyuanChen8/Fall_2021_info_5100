package com.company;

public class Q3 {

    public static void main(String args[]) {
        int Array[] = new int[]{1,3,-1,3,4,-1};
        int times = 0;
        for (int m = 0; m < Array.length; m++) {
            for (int n = 0; n < Array.length; n++) {
                if (Array[m] == Array[n]) {
                    times++;
                }
            }
            if (times == 1) {
                System.out.println(Array[m]);
                break;
            } else {
                times = 0;
            }

        }


    }


}



