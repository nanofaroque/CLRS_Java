package com.algorithms.clrs.chpater_10;
import java.util.Stack;

public class Exercise10_1_6 {
    public static void main(String[] args) {

    }

    Stack<Integer> s1;
    Stack<Integer> s2;
    /**
     * Initialize your data structure here.
     */
    int peek = Integer.MIN_VALUE;

    public Exercise10_1_6() {
        s1 = new Stack<Integer>();
        s2 = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        if (s1.isEmpty()) peek = x;
        s1.add(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        while(s1.size()>1){
            s2.add(s1.pop());
        }

        int popedItem=s1.pop();
        while (!s2.isEmpty()){
            if(s1.isEmpty()) peek=s2.peek();
            s1.add(s2.pop());
        }
        return popedItem;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return peek;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return s1.isEmpty();
    }
}
