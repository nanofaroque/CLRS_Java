package com.algorithms.clrs.chapter_2;

public class Exercise_2P1_4 {
    public static void main(String[] args) {
        int n=3;
        int[] a=new int[]{1,0,1};
        int[] b=new int[]{1,1,0};

        int[] sum=new int[n+1];
        int carry=0;
        int i;
        for (i = n-1; i >=0 ; i--) {
            int s=carry+a[i]+b[i];
            if(s>=2){
                carry=1;
                sum[i]=0;
            }else {
                sum[i+1]=s;
                carry=0;
            }
        }
        if(carry>0)
            sum[0]=carry;
        for(int d:sum)
            System.out.println(d);
    }
}
