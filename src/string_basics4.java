import java.util.Scanner;
//find the unique characters in the given string
public class string_basics4 {
    public static String uniqueCharacters(String string) {
        if(string==null || string.length()==0) {
            return "";
        }
        StringBuilder result=new StringBuilder();

        boolean[] visited=new boolean[200];
        for(int i=0;i<string.length();i++) {
            char current =string.charAt(i);

            if(!visited[current]) {
                result.append(current);
                visited[current]=true;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String string =s.nextLine();
        System.out.println(uniqueCharacters(string));
    }
}
