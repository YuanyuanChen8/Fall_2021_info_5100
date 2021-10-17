package com.company;

public class Q1 {


    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] trans = new int[m][n];
        for(int row = 0;row < m;row++){
            for (int column = 0; column < n;column++){
                trans [column][row]= matrix[row][column];
            }
        }
        return trans;
    }
}