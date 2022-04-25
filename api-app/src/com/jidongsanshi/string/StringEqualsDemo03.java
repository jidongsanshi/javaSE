package com.jidongsanshi.string;

import java.util.Scanner;

public class StringEqualsDemo03 {
    //String.equals
    public static void main(String[] args) {
        String rightName = "jidongsanshi";
        String rightPassword = "123456";

        Scanner sc = new Scanner(System.in);
        System.out.println("账户名：");
        String name = sc.next();
        System.out.println("登录密码：");
        String password = sc.next();

        if(rightName.equals(name)&&rightPassword.equals(password)){//equals 只判断内容 不判断地址
            System.out.println("登录成功");
        }else {
            System.out.println("账户名或密码有误");
        }

        //忽略大小写比较内容的api equalsIgnoreCase

        String sysCode = "23AdFh";
        String code = "23aDfh";
        System.out.println(sysCode.equals(code));
        System.out.println(sysCode.equalsIgnoreCase(code));
    }
}
