import java.util.Scanner;
//You are given two strings str1 and str2 and your task is to find out that str2 can be achieved or created after doing rotations on str1 or not.
//To solve this problem complete function rotationOfStrings with following parameters:
//String str1, str2: Two non empty strings str1 and str2 of same or different lengths.
//Function returns:
//String: The function returns a string containing "str2yes" if str2 can be formed from str1 with rotations otherwise return string with "str2no".
//input- abcd
//       bcda
//output- bcdayes
//input 2- abcd
//         bdca
//output - bdcano
public class strings_med4 {
    public static String rotationOfStrings(String str1, String str2) {
        if(str1.length()!= str2.length()) {
            return str2+"no";
        }
        String concat=str1+str1;
        if(concat.contains(str2)) {
            return str2+"yes";
        } else {
            return str2+"no";
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        System.out.println(rotationOfStrings(str1,str2));
    }
}
