import java.util.Scanner;
//Today, Ms. Tracy learnt a special property about the sum of squares of the digits. Any positive integer N,
//replace the number by the sum of the squares of its digits.
//If this process is repeated endlessly until the number equals 1 (where it will stay),
//or it loops endlessly in a cycle of (89,145,42,20,4,16,37,58) which does not include 1.
// The numbers for which the number equals 1 are Ms. Tracy's favourite numbers. She wants your help to find if a given number is her favourite or not.
public class _11 {
    public static int sumDigit(int n) {
        int sum=0;
        while(n>0) {
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        return sum;
    }
    public static boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do {
            slow=sumDigit(slow);
            fast=sumDigit(sumDigit(fast));
        } while(slow!=fast);
        return slow==1;

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(isHappy(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
