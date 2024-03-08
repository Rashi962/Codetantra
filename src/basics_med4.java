import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
//product of all factors of number n(make sure that for number n, 1 and n are also factors)
public class basics_med4 {

    public static int product(int n) {
        int product=1;
        for(int i=1;i<=n;i++) {
            if(n%i==0) {
                product*=i;
            }
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            System.out.println(product(n));

        }
    }

