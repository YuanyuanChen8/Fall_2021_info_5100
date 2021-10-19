package com.company;

import java.util.ArrayList;
import java.util.List;

public class Q5 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rowNumber = matrix.length, colNumber = matrix[0].length;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return result;

        int top = 0, right = colNumber - 1, bottom = rowNumber - 1, left = 0;

        while (result.size() < rowNumber * colNumber) {
            // buttom to top
            for (int col = bottom; col >= top; col--) {
                result.add(matrix[col][left]);
            }
            left++;

            // left to right
            if (result.size() < rowNumber * colNumber) {
                for (int col = left; col <= right; col++) {
                    result.add(matrix[top][col]);
                }
                top++;
            }
            // top to buttom
            if (result.size() < rowNumber * colNumber) {
                for (int row = top; row <= bottom; row++) {
                    result.add(matrix[row][right]);
                }
                right--;
            }

            // right to left
            if (result.size() < rowNumber * colNumber) {
                for (int row = right; row >= left; row--) {
                    result.add(matrix[bottom][row]);
                }
                bottom--;
            }
        }
        return result;
    }

}
