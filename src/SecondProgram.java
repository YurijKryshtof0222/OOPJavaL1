import java.util.Arrays;

public class SecondProgramm {
    public static void main(String[] args) {
        int[][] matrix = {{9, 3, 7},
                        {4, 8, 10},
                        {7, 11, 6},
                        {2, 5, 5}};
        System.out.println(Arrays.deepToString(matrix));
        int[] arr = maxElements(matrix);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] maxElements(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int[] maxValues = new int[numCols];

        for (int j = 0; j < numCols; j++) {
            int max = matrix[0][j];
            for (int i = 1; i < numRows; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            maxValues[j] = max;
        }

        return maxValues;
    }

}
