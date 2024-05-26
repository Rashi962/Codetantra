import java.util.*;
//armstrong number
public class _1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int n = 0;  //Number of digits
        int sum = 0;
        int originalNum = num;

        //COUNTING NUMBER OF DIGITS
        while (originalNum != 0) {
            originalNum /= 10;
            n++;
        }

        originalNum = num;
        while (originalNum != 0) {
            int digit = originalNum % 10;
            sum+=Math.pow(digit, n);
            originalNum /= 10;
        }

        if (sum == num) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
