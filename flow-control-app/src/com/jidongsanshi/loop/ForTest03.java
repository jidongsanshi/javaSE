package com.jidongsanshi.loop;

public class ForTest03 {
    public static void main(String[] args) {
        // 求1-10中的奇数的和
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                sum += i + 1;
            }
        }
        System.out.println(sum);
        System.out.println("----------------------------");
        //第二种方法
        int sum1 = 0;
        for (int i = 1; i <= 10; i += 2) {
            sum1 += i;
        }
        System.out.println(sum1);
    }
}
