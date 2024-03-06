import java.util.Scanner;
//return reverse of a 5 digit number
public class _8 {
    public static int reverseNum(int n) {
        int reverse=0;
        int originalNum=n;
        while(originalNum!=0) {
            int remainder=originalNum%10;
            reverse=reverse*10+remainder;
            originalNum/=10;


        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(reverseNum(n));
    }
}
