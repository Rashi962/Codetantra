import java.util.Scanner;
public class strings_med8 {
    public static int firstNonRepeat(String str) {
        for(int i=0;i<str.length();i++) {
            boolean repeated=false;
            for(int j=0;j<str.length();j++) {
                if(i!=j && str.charAt(i)==str.charAt(j)) {
                    repeated=true;
                    break;
                }
            }
            if(!repeated) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(firstNonRepeat(str));
    }
}
