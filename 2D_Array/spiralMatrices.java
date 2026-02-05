import java.util.*;

public class spiralMatrices {

    public static void printSpiral(int matrix[][]) {
        
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // TOP
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // RIGHT
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // BOTTOM
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {   // single row case
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // LEFT
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {   // single column case
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        printSpiral(matrix);
        sc.close();
    }
}