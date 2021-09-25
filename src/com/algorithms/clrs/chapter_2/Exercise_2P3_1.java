package com.algorithms.clrs.chapter_2;

public class Exercise_2P3_1 {
    public static void main(String[] args) {
        int in[] = {5, 2, 4, 7, 1, 3, 2, 6};
        mergeSort(in, 0, in.length-1);
        for (int val:in)
            System.out.print(val+" ");
        System.out.println("\n--------");
        int in1[] = {3,41,52,26,38,57,9,49};
        mergeSort(in1, 0, in1.length-1);
        for (int val:in1)
            System.out.print(val+" ");
    }

    private static void mergeSort(int[] in, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(in, l, mid);
            mergeSort(in, mid + 1, r);
            merge(in, l, mid, r);
        }
    }

    private static void merge(int[] in, int l, int mid, int r) {
        // 2 5 6   4 7 9
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = in[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = in[mid + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                in[k] = L[i];
                i++;
            } else {
                in[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            in[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            in[k] = R[j];
            j++;
            k++;
        }
    }
}
