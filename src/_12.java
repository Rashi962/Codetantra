import java.util.Scanner;
//input a number N, output the number of prime numbers that are less than N, for example if input 8 -> then output=4(i.e. 2,3,5,7)
public class _12 {
    public static boolean primeCheck(int n) {
        //corner case
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
    public static int countPrime(int n) {
        int count=0;
        for(int i=2;i<n;i++) {
            if (primeCheck(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(countPrime(n));
    }
}
