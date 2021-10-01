package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

    }

public static class firstNonRpeatingArray{
    public firstNonRpeatingArray(int[] array, int n) {
    }

    public static void main(String args[]) {
        int array[] = {2, 3, 4, 2, 2, 3, 5, 7};
        int n = array.length;
        System.out.println(new firstNonRpeatingArray(array,n));

        int countArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            countArray[i] = 0;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    countArray[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(countArray));

        for (int i = 0; i < array.length; i++) {
            if (countArray[i] == 0) {
                System.out.println(array[i]);

            }
        }
    }
}

}

