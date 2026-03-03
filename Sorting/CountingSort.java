package Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 3, 1};
        int max = 5;
        countingSort(arr, max);
        System.out.println(Arrays.toString(arr));
    }
    static void countingSort (int[] arr, int max) {
        int n = arr.length;
        int[] counts = new int[max + 1];
        for (int i = 0; i < n; i++)
            counts[arr[i]]++;
        int j = 0;
        for (int i = 0; i < max + 1;i++) {
            while(counts[i] != 0) {
                arr[j++] = i;
                counts[i] -= 1;
            }
        }
    }
}
