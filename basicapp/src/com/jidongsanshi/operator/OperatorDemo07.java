package com.jidongsanshi.operator;

public class OperatorDemo07 {
    public static void main(String[] args) {
        //三元运算符
        double score = 59.5;
        System.out.println(score >= 60 ? "通过" : "挂科");

        //去两个值中的较大值
        int a = 15;
        int b = 60;
        int max = a > b ? a : b;
        System.out.println(max);


        System.out.println("---------------案例------------------");
        //需求 求三个数中的最大值
        int p = 66;
        int q = 88;
        int r = 55;
        int max1 = p > q ? p > r ? p : r : q > r ? q : r;
        System.out.println(max1);

    }
}
