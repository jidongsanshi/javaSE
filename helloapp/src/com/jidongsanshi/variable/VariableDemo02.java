package com.jidongsanshi.variable;

public class VariableDemo02 {
    public static void main(String[] args) {
        //变量使用的注意事项
        //1变量必须先声明再使用
        int a = 21;
        System.out.println(a);
        //2变量声明后 不能存储其他类型变量、
//        a = 1.5;
        //3 变量的有效范围是从变量声明后到}为止  在同一范围内不能声明两个同名的变量
        {
            int b = 9;
            System.out.println(b);
//            int b = 4;//报错 一个范围内不能有两个b
        }
//        System.out.println(b);
        int  b =8;
        System.out.println(b);//第一个b已经销毁了
        //4 变量定义的时候可以没有初始化值 但是用的时候必须有初始值
        int c;
//        System.out.println(c);
        c=12;
        System.out.println(c);
    }
}
