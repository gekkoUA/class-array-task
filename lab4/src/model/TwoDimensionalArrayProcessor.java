package model;

public class TwoDimensionalArrayProcessor {
    private int[][] array;

    public TwoDimensionalArrayProcessor(int[][] array) {
        this.array = array;
    }

    public int processArray() {
        int maxSum = Integer.MIN_VALUE;
        for (int[] row : array) {
            int rowSum = 0;
            for (int num : row) {
                rowSum += num;
            }
            maxSum = Math.max(maxSum, rowSum);
        }
        return maxSum;
    }

    public int[][] getArray() {
        return array;
    }
}