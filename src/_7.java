import java.util.Scanner;
//return sum of all factors of n
public class _7 {
    public static int findFactors(int n) {
        int count=0;
        int sum=0;
        for(int i=1;i<=n;i++) {
            if(n%i==0) {
                count++;
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(findFactors(n));
    }
}
