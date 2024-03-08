import java.util.*;
//convert roman string to number
public class basics_med6 {
    public static int romanToNumber(String string) {
        Map<Character, Integer> romanValue = new HashMap<>();
        romanValue.put('I',1);
        romanValue.put('V',5);
        romanValue.put('X',10);
        romanValue.put('L',50);
        romanValue.put('C',100);
        romanValue.put('D',500);
        romanValue.put('M',1000);

        int result=0;
        int previousValue=0;
        for(int i=string.length()-1;i>=0;i--) {
            int currentValue=romanValue.get(string.charAt(i));
            if(currentValue<previousValue) {
                result-=currentValue;
            } else {
                result+=currentValue;
            }
            previousValue=currentValue;
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String string=s.nextLine();
        System.out.println(romanToNumber(string));
    }
}
