import java.util.Scanner;
//sum of first n prime numbers;
public class basics_hard1 {
    public static boolean isPrime(int n) {
        if(n<=1) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static int primeSum(int n) {
        int count=0;
        int sum=0;
        for(int i=2;count<n;i++) {
            if(isPrime(i)) {
                sum+=i;
                count++;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(primeSum(n));
    }
}
