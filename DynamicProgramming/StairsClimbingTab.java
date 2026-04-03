package DynamicProgramming;

public class StairsClimbingTab {
    static int cntWays (int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i < n + 1; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1] + 0;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 50;
        System.out.println(cntWays(n));
    }
}
