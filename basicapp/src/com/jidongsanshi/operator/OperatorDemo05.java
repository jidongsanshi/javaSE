package com.jidongsanshi.operator;

public class OperatorDemo05 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(a == b);//ture
        System.out.println(a != b);//false
        System.out.println(a > b);//false
        System.out.println(a >= b);//true
        System.out.println(a < b);//false
        System.out.println(a <= b);//true

        int i = 15;
        int j = 9;
        System.out.println(i == j);//false
        System.out.println(i != j);//true
        System.out.println(i > j);//true
        System.out.println(i >= j);//true
        System.out.println(i < j);//false
        System.out.println(i <= j);//false

        System.out.println(i = j);//注意不要把== 写成=
    }
}
