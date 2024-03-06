//find geometric sum upto input value k
import java.util.Scanner;
public class _2 {
    public static float geoSum(int k) {
        if(k==0) {
            return 1.0f;
        } else {
            return geoSum(k-1)+1.0f/(float)Math.pow(2,k);
        }

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        System.out.println(String.format("%1.6e",geoSum(k)));
    }



}
