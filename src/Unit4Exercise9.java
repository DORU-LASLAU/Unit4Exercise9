public class Unit4Exercise9 {
    public static void main(String[] argv) {
        int[][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = 0;
            }
        }
        matrix[0][4] = 1;
        matrix[2][6] = 1;
        matrix[3][1] = 1;
        matrix[8][6] = 1;
        int counterRows = 0;
        int counterCols = 0;
        boolean allZeros;
// Count rows
        for (int row = 0; row < matrix.length; row++) {
            allZeros = true;
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] != 0) {
                    allZeros = false;
                    break; // this is optional
                }
            }
            if (allZeros) {
                counterRows++;
            }
        }
// Count columns
        for (int col = 0; col < matrix[0].length; col++) {
            allZeros = true;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] != 0) {
                    allZeros = false;
                    break; // this is optional
                }
            }
            if (allZeros) {
                counterCols++;
            }
        }
        System.out.println("Rows all 0 = " + counterRows);
        System.out.println("Cols all 0 = " + counterCols);
    }
}
