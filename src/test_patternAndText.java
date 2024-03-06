import java.util.Scanner;
//print indexes of the occurence of pattern in the input text
public class test_patternAndText {
    public static void find(String text, String pattern) {
        int index=text.indexOf(pattern);
        while(index!=-1) {
            System.out.print(index + " ");
            index = text.indexOf(pattern, index + 1);
        }
        //if(index==-1) {
            //System.out.print("-1");
        //}



    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String text=s.nextLine();
        String pattern=s.nextLine();
        find(text,pattern);

    }
}
