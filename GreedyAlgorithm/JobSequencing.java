package GreedyAlgorithm;
import java.util.*;
public class JobSequencing {
    static class Jobs {
        char id;
        int deadline, profit;
        Jobs (char id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Jobs[] jobs = new Jobs[n];
        int maxdd = Integer.MIN_VALUE;

        for (int i = 0;i < n;i++) {
            char id = sc.next().charAt(0);
            int deadline = sc.nextInt();
            int profit = sc.nextInt();
            jobs[i] = new Jobs(id, deadline, profit);
            if (deadline > maxdd) maxdd = deadline;
        }

//        Sort Jobs array in descending order atq to profit
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

//        Resultant arr and slot array for figuring out the unoccupied slots
        char[] result = new char[maxdd];
        boolean[] slot = new boolean[maxdd];

//        Actual Logic for Job sequencing
        int totalpf = 0;
        for (int i = 0;i < n;i++) {
            for (int j = Math.min(maxdd, jobs[i].deadline) - 1;j >= 0;j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    result[j] = jobs[i].id;
                    totalpf += jobs[i].profit;
                    break;
                }
            }
        }

//        Printing the Job sequence in which profit is maximised
        for (int i = 0;i < maxdd;i++) {
            if (slot[i]) {
                System.out.print(result[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Total profit : " + totalpf);
    }
}
