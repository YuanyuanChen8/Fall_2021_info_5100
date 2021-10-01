package com.company;


public class Main {

    public static void main(String args[]) {
        int Array[] = new int[]{2, 3, 4, 2, 2, 3, 5, 7};
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
