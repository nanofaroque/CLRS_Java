package com.algorithms.clrs.chapter_2;

public class Exercise_2P1_1 {
    public static void main(String[] args) {
        int[] in = new int[]{31, 41, 59, 26, 41, 58};
        sort(in);
        for (int i : in)
            System.out.println(i);
    }

    private static void sort(int[] in) {
        for (int start = 1; start < in.length; start++) {
            int key = in[start];
            int i = start - 1;
            while (i >= 0 && in[i] > key) {
                in[i + 1] = in[i];
                i--;
            }
            in[i + 1] = key;
        }
    }
}
