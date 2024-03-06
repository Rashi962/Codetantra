import java.util.Scanner;

class test_matrixRotationMultiplyNinty {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = s.nextInt();  // input matrix
            }
        }
        int angle = s.nextInt();
        s.nextLine(); // consume newline character
        String direction = s.nextLine();

        rotateMatrix(matrix, angle, direction);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " "); // output format
            }
            System.out.println();
        }
    }

    private static void rotateMatrix(int[][] matrix, int angle, String direction) {
        int len = matrix.length;
        int[][] temp = new int[len][len];
        for (int k = 0; k < angle / 90; k++) {
            // clockwise rotation
            if (direction.equals("C")) {
                for (int i = 0; i < len; i++) {
                    for (int j = 0; j < len; j++) {
                        temp[j][len - 1 - i] = matrix[i][j];
                    }
                }
            }
            // anticlockwise
            else if (direction.equals("A")) {
                for (int i = 0; i < len; i++) {
                    for (int j = 0; j < len; j++) {
                        temp[len - 1 - j][i] = matrix[i][j];
                    }
                }
            }
            // copy rotated matrix to original matrix
            for (int i = 0; i < len; i++) {
                System.arraycopy(temp[i], 0, matrix[i], 0, len);
            }
        }
    }
}
