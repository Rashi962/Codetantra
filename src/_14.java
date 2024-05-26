import java.util.Scanner;
//given number n, find nearest integer which is a power of 2. If the number n is equidistant from two powers of 2, then print the higher one
//eg- input 5, output 2 and input 31 output 32, input =3 then output=4
public class _14 {
    public static int nearestPowerCalculate(int n) {
        int nearestPower=1;
        while(nearestPower<n) {
            nearestPower*=2;
        }
        if(nearestPower-n>n-nearestPower/2) {
            return nearestPower/2;
        } else {
            return nearestPower;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(nearestPowerCalculate(n));
    }

}
