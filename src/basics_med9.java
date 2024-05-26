//given n pair of parantheses, code to count all combinations of well formed parantheses
//for example-
//input - 3
//output - 5
//i.e. ["((()))","(()())","(())()","()(())","()()()"]
import java.util.Scanner;
public class basics_med9{
    public static int countParantheses(int n) {
        if(n==0) {
            return 0;
        }
        int[] dp=new int[n+1];
        dp[0]=1;

        for(int i=1;i<=n;i++) {
            for(int j=0;j<i;j++) {
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int result=countParantheses(n);
        System.out.println(result);
    }
}