package DynamicProgramming;

public class StairsClimbing {
    static int cntWays (int n) {

        if (n <= 0) return 0;

        if (n == 2 || n == 1) return n;

        return cntWays(n - 1) + cntWays(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(cntWays(7));
    }
}
