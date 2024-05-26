import java.util.Scanner;
//check whether palindrome or not
public class strings_basics6 {
    public static String palindrome(String string) {
        if(string.equals(new StringBuilder(string).reverse().toString())) {
            return "Palindrome";
        } else {
            return "Not a palindrome";
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String string=s.next();
        System.out.println(palindrome(string));
    }
}
