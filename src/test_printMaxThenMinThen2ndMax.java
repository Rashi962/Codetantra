import java.util.Scanner;

public class test_printMaxThenMinThen2ndMax {
    public static void rearrange(int[] arr, int n) {
        int[] rearranged = new int[n];
        int start = 0, end = n - 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                rearranged[i] = arr[end--];
            } else {
                rearranged[i] = arr[start++];
            }
        }

            //copy the rearranged array back in the array
            for (int i = 0; i < n; i++) {
                arr[i] = rearranged[i];

        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        rearrange(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
