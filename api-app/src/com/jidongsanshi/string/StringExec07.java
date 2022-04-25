package com.jidongsanshi.string;

import java.util.Scanner;

public class StringExec07 {
    //手机号码屏蔽
    public static void main(String[] args) {
        //1键盘录入手机号码

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的手机号码：");
        String tel = scanner.next();

        //2截取号码的前三位 后四位
        String before = tel.substring(0, 3);
        String after = tel.substring(7);
        String s = before + "****" + after;
        System.out.println(s);
    }
}
