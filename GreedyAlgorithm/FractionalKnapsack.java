package GreedyAlgorithm;

import java.util.Scanner;
import java.util.Arrays;

public class FractionalKnapsack {
    static class Items {
        int val, wt;
        Items (int v, int w) {
            val = v;
            wt = w;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int w = sc.nextInt();

        Items[] items = new Items[n];

        for (int i = 0;i < n;i++) {
            int val = sc.nextInt();
            int wt = sc.nextInt();
            items[i] = new Items(val, wt);
        }

        Arrays.sort(items, (a, b) -> {
            double r1 = (double) a.val/a.wt;
            double r2 = (double) b.val/b.wt;
            return Double.compare(r2, r1);
        });

        double totVal = 0.0;

        for (int i = 0; i < n; i++) {

            if (w == 0) break;

            if (items[i].wt <= w) {
                totVal += items[i].val;
                w -= items[i].wt;
            } else {
                totVal += ((double) items[i].val * w) / items[i].wt;
                w = 0;
            }
        }
        System.out.printf("%.6f", totVal);
    }
}
