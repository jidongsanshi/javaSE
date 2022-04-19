package com.jidongsanshi.test;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest04 {
    public static void main(String[] args) {
        //需求 录入一组工号 输出一个随机的工号顺序

        //1 准备一个数组
        int[] codes = new int[5];

        //2录入
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第"+(i+1)+"个员工的工号");
            codes[i]=scanner.nextInt();
        }

        //3随机排序并输出
        Random random = new Random();
        for (int i = 0; i < codes.length; i++) {
            int j = random.nextInt(5);
            int temp = codes[i];
            codes[i]=codes[j];
            codes[j]=temp;
        }
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i]+ " ");
        }
    }
}
