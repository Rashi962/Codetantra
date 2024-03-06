import java.util.Scanner;
public class test_spaceMission {
    public static String sameOnBothPlanet(int n) {
        int reverse=0;
        int num=n;
        while(num!=0) {
            int remainder=num%10;
            reverse=reverse*10+remainder;
            num/=10;
        }
        if(reverse==n) {
            return "True";
        } else {
            return "False";
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(sameOnBothPlanet(n));
    }
}
