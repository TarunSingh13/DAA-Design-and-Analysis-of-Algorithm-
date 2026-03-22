package DynamicProgramming;

import java.util.Scanner;

public class FibBtmUpApproach {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(CalFib(n));

    }
    static long CalFib (int n) {

        if (n == 1 || n == 0) return (long) n;

        long[] dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2;i < n + 1;i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];

    }
}
