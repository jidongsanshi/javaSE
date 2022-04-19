package com.jidongsanshi.test;

public class ArrayTest01 {
    public static void main(String[] args) {
        //案例：数组遍历求和
        //需求 五个员工的销售额分别是 16 26 35 85 45 求总销售额

        int[] money = {16,26,35,85,15};
        int all = 0;
        for (int i = 0; i < money.length; i++) {
            all+=money[i];
        }
        System.out.println(all);
    }
}
