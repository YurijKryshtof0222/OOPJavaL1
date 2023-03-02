import java.util.Arrays;

public class SecondProgram {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = (int)(Math.random() * 30);
            }
        }
        //System.out.println(Arrays.deepToString(matrix));
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
