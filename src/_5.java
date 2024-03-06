import java.util.Scanner;
//function should return the LCM of three numbers
public class _5 {
    public static int findLCM(int n1,int n2,int n3) {
        int max=Math.max(Math.max(n1,n2),n3);
        for(int i=max;;i++) {
            if(i%n1==0&&i%n2==0&&i%n3==0) {
                return i;
            }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int n3=s.nextInt();
        System.out.println(findLCM(n1,n2,n3));
    }
}
