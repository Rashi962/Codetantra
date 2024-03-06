import java.util.*;
//matric rows and columns are sorted in ascending manner, we need to arrange all elements in ascending order creating sorted list
public class test_sortingMatrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[][] matrix=new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                matrix[i][j]=s.nextInt();
            }
        }
        //add all elements in an array list
        List<Integer> elements=new ArrayList<>();
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                elements.add(matrix[i][j]);
            }
        }
        //sort it
        Collections.sort(elements);
        for(int i=0;i<elements.size();i++) {
            System.out.println(elements.get(i));
            if(i<elements.size()-1) {
                System.out.print(" ");
            }
        }
    }
}
