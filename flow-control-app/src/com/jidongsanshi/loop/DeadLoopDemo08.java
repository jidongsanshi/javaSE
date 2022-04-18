package com.jidongsanshi.loop;

import java.util.Scanner;

public class DeadLoopDemo08 {
    public static void main(String[] args) {
        //死循环
        //for死循环
//        for (;;) {
//            System.out.println("hello world");
//        }


        //while 死循环经典
//        while (true){
//            System.out.println("我是死循环");
//        }

        //do while 死循环
//        do{
//            System.out.println("我是死循环");
//        }while (true);

        //密码比对案例
        //需求 密码为520 让用户一直输入 直到输对为止
        int password = 520;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入正确的密码");
            int input = sc.nextInt();
            if (input == password) {
                System.out.println("密码正确");
                break;
            }
            System.out.println("密码错误");
        }

    }
}
