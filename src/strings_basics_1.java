import java.util.Scanner;
//string reversal fully reversal
public class strings_basics_1 {

    public static String reverseWord(String n) {
        StringBuilder reverseWord=new StringBuilder();
        for(int i=n.length()-1;i>=0;i--) {
            reverseWord.append(n.charAt(i));
        }
        return reverseWord.toString();
    }
    public static String stringReverse(String str) {
        String[] n=str.split(" ");
        StringBuilder reverseString=new StringBuilder();

        for(int i=n.length-1;i>=0;i--) {
            reverseString.append(reverseWord(n[i]));
            if(i>0) {
                reverseString.append(" ");
            }
        }
        return reverseString.toString();
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(stringReverse(str));
    }
}
