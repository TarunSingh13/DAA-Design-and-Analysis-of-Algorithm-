package DynamicProgramming;

import java.util.Scanner;
import java.util.Arrays;

public class FibTopDownApproach {
    static int[] dp;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for n : ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(n + " fib number is 0");
        }

        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;

        if (dp[n] == -1) {
            int ans = CalFib(n);
        }
        System.out.println(n + " fib number is " + dp[n]);
    }
    static int CalFib (int n) {

        if (n == 1 || n == 0) return n;

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = CalFib(n - 1) + CalFib(n - 2);

        return dp[n];

    }
}
