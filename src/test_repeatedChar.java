import java.util.Scanner;
//number of repeated characters,print the first repeated character
public class test_repeatedChar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String string=s.nextLine();
        int[] count=new int[26];
        for(int i=0;i<string.length();i++) {
            char c=string.charAt(i);
            if(count[c-'a']==1) {
                System.out.println(c);
                return;
            } else {
                count[c-'a']++;
            }
        }
        System.out.println("0");
    }
}
