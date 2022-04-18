package com.jidongsanshi.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest02 {
    public static void main(String[] args) {
        //猜数字游戏 1-100 猜完后告诉用户猜打了还是猜小了 知道猜对为止

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int data = r.nextInt(100)+1;
        while (true){
            System.out.println("输入你猜的数字(1-100)");
            int input = sc.nextInt();
            if(input>data){
                System.out.println("猜大了");
            }else if(input<data){
                System.out.println("猜小了");
            }else {
                System.out.println("猜对了");
                break;
            }

        }
    }
}
