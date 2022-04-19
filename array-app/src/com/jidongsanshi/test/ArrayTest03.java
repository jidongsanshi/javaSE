package com.jidongsanshi.test;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest03 {
    public static void main(String[] args) {
        //需求 生成五个 1-20之间的数字 用户猜 猜中提示猜中 并输出位置 和全部数组
        //没有猜中继续猜

        //1 定义一个动态数组
        int[] data = new int[5];

        Random random = new Random();

        //2 动态生成5个1-20之间的随机数
        for (int i = 0; i < 5; i++) {
            data[i]=random.nextInt(10)+1;

        }

        //3 一个死循环让用户猜测
        Scanner scanner = new Scanner(System.in);
        OUT:
        while (true){
            System.out.println("输入一个1-20的数字");
            int guessData = scanner.nextInt();



            //和数组对比

            for (int i = 0; i < data.length; i++) {
                if(data[i]==guessData){
                    System.out.println("你猜到了数据 你猜中的数据索引为"+i);
                    break OUT;
                }
            }

            System.out.println("猜错了 继续");

        }
        // 输出数组的所有数组
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

}
