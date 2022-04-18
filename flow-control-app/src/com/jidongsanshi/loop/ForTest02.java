package com.jidongsanshi.loop;

public class ForTest02 {
    public static void main(String[] args) {
        //for循环案例
        //需求 求1到5的和 打印输出
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i + 1;
        }
        System.out.println(sum);
    }
}
