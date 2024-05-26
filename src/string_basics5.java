import java.util.Arrays;
import java.util.Scanner;
//anagram or not- print anagram or not anagram
//anagram if both strings contains same characters arranged in any order
public class string_basics5 {
    public static String anagramCheck(String str1, String str2) {
        if(str1.length()!= str1.length()) {
            return "Not Anagram";
        }
        char[] charArray1=str1.toCharArray();
        char[] charArray2=str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if(Arrays.equals(charArray1,charArray2)) {
            return "Anagram";
        } else {
            return "Not Anagram";
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.next();
        String str2=s.next();
        System.out.print(anagramCheck(str1,str2));
    }
}
