import java.util.*;
//You are given a string str.
// remove all the consecutive duplicate occurrences from the given string str.
public class string_basics3 {
    public static String removeConsecutiveCharacters(String string) {
        if(string==null || string.length()==0) {
            return "";
        }
        StringBuilder result=new StringBuilder();

        for(int i=0;i<string.length();i++) {
            result.append(string.charAt(i));
            while(i+1<string.length() && string.charAt(i)==string.charAt(i+1)) {
                i++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String string=s.nextLine();
        System.out.println(removeConsecutiveCharacters(string));
    }
}
