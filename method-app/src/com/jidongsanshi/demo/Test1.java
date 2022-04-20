package com.jidongsanshi.demo;

public class Test1 {
    //案例一 求1-n的和
    public static int sum(int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=i+1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("1到100的和为"+sum(100));
    }
}
