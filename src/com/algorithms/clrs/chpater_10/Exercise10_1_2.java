package com.algorithms.clrs.chpater_10;

import java.util.Arrays;

public class Exercise10_1_2 {
    static int[] stack;
    static int N = 10;
    static int firstStackHead = 0;
    static int secondStackHead = N - 1;

    public static void main(String[] args) {
        stack = new int[N];
        Arrays.fill(stack, -1);
        push(10, 1);
        push(12, 2);
        pop(2);
        push(22, 2);
        System.out.println(stack);
    }

    private static void push(int val, int id) throws RuntimeException {
        if (firstStackHead >= secondStackHead) {
            throw new RuntimeException("Stack is full");
        }
        if (id == 1) {
            stack[firstStackHead++] = val;
        }
        if (id == 2) {
            stack[secondStackHead--] = val;
        }
    }

    /**
     * id is the ID of the stack.
     * id=1, means first stack and id=2 means second stack
     */
    private static int pop(int id) {
        if (id == 1) {
            return stack[--firstStackHead];
        }
        return stack[++secondStackHead];
    }
}
