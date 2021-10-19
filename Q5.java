package com.company;

import java.util.ArrayList;
import java.util.List;

public class Q5 {

    public List<Integer> spiralOder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rows = matrix.length, columns = matrix[0].length;

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return result;
        int top = 0, right = columns - 1, bottom = rows - 1, left = 0;
        while (result.size() < rows * columns) {
            //left to right
            for (int col = left; col <= right; col++) {
                result.add(matrix[top][col]);
            }
            top++;
        }
        if (result.size() < rows * columns) {
            //top to bottom
            for (int row = top; row <= bottom; row++) {
                result.add(matrix[row][right]);
            }
            right--;
        }

        if (result.size() < rows * columns) {
            //right to left
            for (int row = right; row >= left; row--) {
                result.add(matrix[bottom][row]);
            }
            bottom--;

        }
        if (result.size() < rows * columns) {
            //bottom to top
            for (int col = bottom; col >= top; col--) {
                result.add(matrix[col][left]);
            }
            left++;
        }
        return result;
    }

}







//54