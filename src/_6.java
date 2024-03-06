import java.util.Scanner;
//return nth prime number
public class _6 {
    public static int prime(int n) {
        int count=0;
        int number=2;
        while(count<n) {
            if(isprime(number)) {
                count++;
            }
            number++;
        }
        return number-1;
    }
    static boolean isprime(int num) {
        if(num<=1) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++) {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(prime(n));
    }
}