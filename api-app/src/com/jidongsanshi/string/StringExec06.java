package com.jidongsanshi.string;

import java.util.Scanner;

public class StringExec06 {
    //模拟用户登录
    public static void main(String[] args) {
        //1 定义正确的登录名称和密码
        String rightLogName = "jidongsanshi";
        String rightPassword = "123456";

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入登录名");
            String logName = sc.next();
            System.out.println("请输入登录密码");
            String password = sc.next();

            if(logName.equals(rightLogName)&&password.equals(rightPassword)){
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("用户名或密码有问题 还有"+ (2-i)+"次机会");
            }
        }
    }
}
