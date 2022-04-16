package com.jidongsanshi.operator;

public class OperatorDemo04 {
    public static void main(String[] args) {
        //赋值运算符 = += -= *= /= %=
        int a = 10;
        int b = 200;
        a += b;//相当于a=a+b
        System.out.println(a);


        byte i = 5;
        byte j = 15;
        i += j;//i=(int)(i+j)  自带强制类型转换
        System.out.println(i);

        int m = 15;
        int n = 5;
        m %= n;//其他几个赋值运算符类似
        System.out.println(m);
    }
}
