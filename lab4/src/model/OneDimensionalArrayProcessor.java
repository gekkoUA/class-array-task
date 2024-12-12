package model;

public class OneDimensionalArrayProcessor {
    private int[] array;

    public OneDimensionalArrayProcessor(int[] array) {
        this.array = array;
    }

    public int processArray() {
        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public int[] getArray() {
        return array;
    }
}
