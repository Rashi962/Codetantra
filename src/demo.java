import java.util.Scanner;
//90 degree clockwise rotation
public class demo {
    public static void clockRotate(int[][] matrix) {
        //transpose of matrix
        int n=matrix.length;
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //now reverse the string
        for(int i=0;i<n;i++) {
            for(int j=0;j<n/2;j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int matrix[][]=new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                matrix[i][j]=s.nextInt();
            }
        }
        clockRotate(matrix);
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
