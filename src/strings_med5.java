/*
A top secret message containing letters from A-Z is being encoded to numbers using the following mapping:



'A' -> 1

'B' -> 2

...

'Z' -> 26
You are an FBI agent. You have to determine the total number of ways that
message can be decoded, as the answer can be large return the answer modulo
10^9 + 7.
Note: An empty digit sequence is considered to have one decoding. It may be assumed that the input contains valid digits from 0 to 9 and If there are leading 0’s, extra trailing 0’s and two or more consecutive 0’s then it is an invalid string.
Sample Test case 1:
Input str = "123"
Output:3
Sample Test case 2:
Input:str = "27"
Output:1
Explanation:
In test case 1, "123" can be decoded as "ABC"(123), "LC"(12 3) and "AW"(1 23).
*/


import java.util.Scanner;

//In test case 2, "27" can be decoded as "BG".
public class strings_med5 {
    public static int numDecoding(String str) {
        if(str==null||str.length()==0||str.charAt(0)=='0') {
            return 0;
        }
        int mod=1000000007;
        int n=str.length();
        long[] dp=new long[n+1];
        dp[0]=1;
        if(str.charAt(0)=='0') {
            dp[1]=0;
        } else {
            dp[1]=1;
        }
        for(int i=2;i<=n;i++) {
            int oneDigit=Integer.parseInt(str.substring(i-1,i));
            int twoDigit=Integer.parseInt(str.substring(i-2,i));

            if(oneDigit>=1 && oneDigit<=9) {
                dp[i]+=dp[i-1];
                dp[i]%=mod;
            }
            if(twoDigit>=10 && twoDigit<=26) {
                dp[i]+=dp[i-2];
                dp[i]%=mod;
            }

        }
        return (int) dp[n];
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(numDecoding(str));
    }
}
