import java.util.Scanner;
//number of trailing zeroes in factorial of n
public class _10 {
    public static int countZeroes(int n) {
        int count=0;
        for(int i=5;n/i>=1;i*=5) {
            count+=n/i;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(countZeroes(n));
    }
}
