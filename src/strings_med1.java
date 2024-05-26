import java.util.Scanner;
//input one string and another character to remove from string and get the output string
//for example - input - abaac a
//output - bc

public class strings_med1 {
    public static String removeChar(String str, String ch) {
        String result=str.replace(ch,"");
        if(result.isEmpty()) {
            return "empty";
        } else {
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String ch=s.next();
        System.out.println(removeChar(str,ch));
    }
}
