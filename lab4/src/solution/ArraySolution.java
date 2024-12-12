package solution;

import model.OneDimensionalArrayProcessor;
import model.TwoDimensionalArrayProcessor;

public class ArraySolution {
    public static void solve1DArrayTask(int[] array) {
        OneDimensionalArrayProcessor processor = new OneDimensionalArrayProcessor(array);
        int result = processor.processArray();
        System.out.println("1D Array Sum of Even Numbers: " + result);
    }

    public static void solve2DArrayTask(int[][] array) {
        TwoDimensionalArrayProcessor processor = new TwoDimensionalArrayProcessor(array);
        int result = processor.processArray();
        System.out.println("2D Array Maximum Row Sum: " + result);
    }
}