//take two strings as input and return length of smallest string which has the two strings as its substring
//for example p= wxyz
//            q= abyz
//      output = 6
import java.util.Scanner;
public class test_yankySupersequence {
    public static int smallestSubsequence(String p,String q){
        int m=p.length();
        int n=q.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++) {
            for(int j=0;j<=n;j++) {
                if(i==0||j==0) {
                    dp[i][j]=0;   //dp is storing longest common subsequence length
                } else if(p.charAt(i-1)==q.charAt(j-1)) {
                    dp[i][j]=1+dp[i-1][j-1];
                } else {
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return m+n-dp[m][n];
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String p=s.nextLine();
        String q=s.nextLine();
        System.out.println(smallestSubsequence(p,q));
    }
}