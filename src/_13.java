import java.util.Scanner;
//find the count of prime numbers between two numbers
public class _13 {
    //finding if a number is prime or not
    public static boolean isPrime(int n) {
        if(n<=1) {
            return false;
        }
        for(int i=2;i<n;i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    //counting the prime numbers
    public static int count(int n1, int n2) {
        int count=0;
        for(int i=n1;i<=n2;i++) {
            if(isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        System.out.println(count(n1,n2));
    }
}
