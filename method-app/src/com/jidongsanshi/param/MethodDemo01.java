package com.jidongsanshi.param;

public class MethodDemo01 {
    public static void main(String[] args) {
        //理解java的基本类型的参数传递（传递值）
        int a = 10;
        change(a);
        System.out.println(a);//10
    }

    public static void change(int a) {
        System.out.println(a);//10
        a = 20;
        System.out.println(a);//20
    }
}
