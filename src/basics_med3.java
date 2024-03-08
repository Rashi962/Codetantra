import java.util.Scanner;
//three cars start at the same time and take N1, N2, N3 minutes to complete 1 lap. How much time will it take for all three
//cars to meet at the starting point again
public class basics_med3 {
    public static int timeCalculate(int N1, int N2, int N3) {
        int time=1;
        while(time%N1!=0||time%N2!=0||time%N3!=0) {
            time++;
        }
        return time;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N1=s.nextInt();
        int N2= s.nextInt();
        int N3=s.nextInt();
        System.out.println(timeCalculate(N1,N2,N3));
    }
}
