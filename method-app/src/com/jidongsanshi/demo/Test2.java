package com.jidongsanshi.demo;

public class Test2 {
    //案例二 判断奇数还是偶数
    public static void judge(int n) {
        if (n % 2 == 0) {
            System.out.println(n + "是偶数");
        } else {
            System.out.println(n + "是奇数");
        }
    }

    public static void main(String[] args) {
        judge(5);
        judge(88);
    }
}
