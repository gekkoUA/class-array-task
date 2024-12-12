package solution;

public class Main {
    public static void main(String[] args) {
        int[] oneDArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] twoDArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        ArraySolution.solve1DArrayTask(oneDArray);
        ArraySolution.solve2DArrayTask(twoDArray);
    }
}