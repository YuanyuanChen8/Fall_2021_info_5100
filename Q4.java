package com.company;

public class Q4 {

    public void rotate(int[][] matrix){
        int left = 0;
        int right = matrix.length - 1;

        while(left <= right){
            int i = left;
            int j =  right;
            while(i != right){
                int temp = matrix[left][i];
                matrix[left][i] = matrix[j][left];
                matrix[j][left] = matrix[right][j];
                matrix[right][j] = matrix[i][right];
                matrix[i][right] = temp;
                i +=1;
                j -=1;


            }

        }

    }
}

