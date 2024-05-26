import java.util.Scanner;
//Pascals Triangle- Given an integer row index, return the row values separated by space of that index inputted
public class basics_med1 {
    public static int[] generatePascalRow(int rowIndex) {
        int[] row=new int[rowIndex+1];
        row[0]=1;

        for(int i=1;i<=rowIndex;i++) {
            for(int j=i;j>0;j--) {
                row[j]+=row[j-1];
            }
        }
        return row;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int rowIndex=s.nextInt();
        int[] row=generatePascalRow(rowIndex);

        for(int num:row) {
            System.out.print(num+" ");
        }
    }
}
