package com.jidongsanshi.scanner;

import java.util.Scanner;

public class ScannerDemo01 {
    public static void main(String[] args) {
        //键盘录入api
        //1 导包  idea会自动导包
        //创建一个scanner对象

        Scanner sc=new Scanner(System.in);
        //调用sc对象去接用户输入的数据
        //sc会等待用户输入数据 直到用户输完数据并按下回车
        System.out.println("请输入你的年龄是");
        int age =sc.nextInt();
        System.out.println("你的年龄是"+age);
        System.out.println("请输入你的姓名");
        String name =sc.next();
        System.out.println("欢迎"+name);

    }
}
