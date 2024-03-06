import java.util.Scanner;
//return boolean whether palindrome number or not
public class _4
{

    public static boolean IsBoolean(int n) {
        int reverse=0;
        int remainder;
        int originalNum=n;
        while(originalNum!=0) {
            remainder=originalNum%10;
            reverse=reverse*10+remainder;
            originalNum/=10;
        }

        if(reverse==n) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(IsBoolean(n));
    }
}
