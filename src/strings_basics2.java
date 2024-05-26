import java.util.Scanner;
//magic string- return 1 if yes or 0 if not, S contains only m,n,o,p. Magic string is m+o=even and n+p=even
public class strings_basics2 {
    public static int magicStringSum(String s) {
        int mcount=0,ncount=0,ocount=0,pcount=0;
        for(int i=0;i<s.length();i++){
            char choice=s.charAt(i);
            switch(choice) {
                case 'm':
                    mcount++;
                    break;
                case 'n':
                    ncount++;
                    break;
                case 'o':
                    ocount++;
                    break;
                case 'p':
                    pcount++;
                    break;
                default: return 0;
            }
        }
        if(((mcount+ocount)%2==0) && ((ncount+pcount)%2==0)) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        System.out.println(magicStringSum(s));
    }
}
