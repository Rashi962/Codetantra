import java.util.Scanner;
//finding if a number is happy or not

public class _9 {
    public static int digitSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(digitSquareSum(fast));
        } while(slow!=fast);
        return slow == 1;
    }


    public static int happyNumbers(int n1, int n2) {
        int count = 0;
        for (int i = n1; i <= n2; i++) {
            if (isHappy(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println(happyNumbers(n1, n2));
    }
}
