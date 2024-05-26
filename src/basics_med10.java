//input of whole number N and then output of number of zeroes till that N starting from 1
//for example - input 12, output 1 and input - 9, output - 0
import java.util.Scanner;
public class basics_med10 {
    public static int countZerosInNumber(int num) {
        int count=0;
        while(num>0) {
            if(num%10==0) {
                count++;
            }
            num/=10;
        }
        return count;
    }
    public static int countZeros(int N) {
        int count=0;
        for(int i=1;i<=N;i++) {
            count+=countZerosInNumber(i);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int result=countZeros(N);
        System.out.println(result);
    }
}
