package com.jidongsanshi.operator;

public class OperatorTest01 {
    public static void main(String[] args) {
        //案例 数值拆分
        //需求 把一个三位数的百位十位个位分别打印出来
        int data = 567;
        //1 个位
        int first = data % 10;

        //2 十位
        int second = data / 10 % 10;

        //3百位
        int third = data / 100;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);


    }
}
