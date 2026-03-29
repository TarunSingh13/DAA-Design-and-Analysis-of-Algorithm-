package DynamicProgramming;
import java.util.Arrays;

public class ClimbingStairsRec {
    public static void main(String[] args) {
        int n = 50;
        int[] arr = new int[n + 1];
        Arrays.fill(arr, -1);
        arr[0] = 1;
        System.out.println(cntWays(n, arr));
    }
    static int cntWays (int n, int[] arr) {

        if (n == 0) return 1;

        if (n < 0) return 0;

        if (arr[n] != -1) return arr[n];

        arr[n] = cntWays(n - 1, arr) + cntWays(n - 2, arr);

        return arr[n];
    }
}
