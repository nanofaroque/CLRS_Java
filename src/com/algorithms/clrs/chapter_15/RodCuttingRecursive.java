package com.algorithms.clrs.chapter_15;

import java.util.HashMap;

public class RodCuttingRecursive {
    static HashMap<Integer,Integer> cache=new HashMap<>();
    public static void main(String[] args) {
        int p[] ={1,5,8,9,10,17,17,20,24,30,1,5,8,9,10,17,17,20,24,30,1,5,8,9,10,17,17,20,24,30,1,5,8,9,10,17,17,20,24,30};
        int n=40;
        int val= maxProfit(p,n);
        System.out.println(val);
    }
    private static int maxProfit(int[] p, int n) {
        if(n==0) return 0;
        if(cache.containsKey(n)) return cache.get(n);
        int profit=0;
        for(int i=1;i<=n;i++){
            profit=Math.max(profit,p[i-1]+maxProfit(p,n-i));
            System.out.println(profit);
            cache.put(n,profit);
        }
        return profit;
    }
}
