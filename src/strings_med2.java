import java.util.Scanner;
//Note: This question appeared in the Recruitment/Technical Interviews of Flipkart, and Accolite Lab, Year 2023.
//In a sentence, Words will be separated by one or more white-space characters. Hyphens join two words into one and should be retained while the other punctuation marks should be stripped. Determine the number of words in a given sentence.
// for example- How many apples are in a one-packing, 12?
//output should be 7
public class strings_med2 {

    public static int wordCount(String Str) {
        String[] words = Str.split("\\s+");

        int count = 0;
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z\\-]", "");

            if (!word.isEmpty() && word.matches("[a-zA-Z\\-]+")) {
                count++;
            }

        }
        return count;
    }



    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String Str=s.nextLine();
        System.out.println(wordCount(Str));
    }
}
