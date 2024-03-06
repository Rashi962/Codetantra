import java.util.Scanner;
//two strings- * means any string of characters or empty string can be replaced by it and ? means only blank
public class test_stringMatch {
        public static boolean matchStrings(String w, String s) {
            int wCurrentIndex=0, sCurrentIndex=0;
            int wLastFoundIndex=-1,sLastFoundIndex=-1;

            while(sCurrentIndex<s.length()) {
                if(wCurrentIndex<w.length() && (w.charAt(wCurrentIndex)==' '||w.charAt(wCurrentIndex)==s.charAt(sCurrentIndex))) {
                    wCurrentIndex++;
                    sCurrentIndex++;
                } else if(wCurrentIndex<w.length() && w.charAt(wCurrentIndex) == '*') {
                    wLastFoundIndex = wCurrentIndex;
                    sLastFoundIndex = sCurrentIndex;
                    wCurrentIndex++;
                } else if(wLastFoundIndex!=-1) {
                    wCurrentIndex = wLastFoundIndex+1;
                    sCurrentIndex = sLastFoundIndex+1;
                    sLastFoundIndex++;
                } else {
                    return false;
                }
            }

            while (wCurrentIndex<w.length() && w.charAt(wCurrentIndex) == '*') {
                wCurrentIndex++;
            }

            return wCurrentIndex == w.length() && sCurrentIndex == s.length();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the wildcard string:");
            String w = scanner.nextLine();
            System.out.println("Enter the normal string:");
            String s = scanner.nextLine();

            System.out.println("Match result: " + matchStrings(w, s));
        }
    }


