//find factors of a number, arrange in ascending order and then return the ith element from the list
import java.util.Scanner;
public class _3 {
    public static int findFactor (int n,int i) {
        int count=0;

        //find the factors
        for(int factor=1;factor<=n;factor++) {
            if(n%factor==0) {
                count++;

                if(count==i) {
                    return factor;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=s.nextInt();
        System.out.println(findFactor(n,i));

    }
}
