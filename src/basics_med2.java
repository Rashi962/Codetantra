import java.util.Scanner;
//sum of all prime numbers between n1 and n2
public class basics_med2 {
    //find prime numbers
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

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int sum=0;
        if(n1>n2) {
            int temp=n1;
            n1=n2;
            n2=temp;
        }
        for(int i=n1;i<=n2;i++) {
            if(isPrime(i)) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }

}
