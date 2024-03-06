import java.util.Scanner;
//take square matrix as input and return the 90 degree clockwise rotation of it making sure to rotate the image in place, which means should modify the input 2D matrix directly. dont allocate another 2D matrix and do the rotation
public class test_clockwise {
    public static void rotate(int[][] matrix) {
        //transpose of the matrix
        int n=matrix.length;
        //transpose
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //reverse each row
        for(int i=0;i<n;i++) {
            for(int j=0;j<n/2;j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
    }



    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int[][] matrix=new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                matrix[i][j]=s.nextInt();
            }
        }
        rotate(matrix);
        //print the rotated matrix
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

}
