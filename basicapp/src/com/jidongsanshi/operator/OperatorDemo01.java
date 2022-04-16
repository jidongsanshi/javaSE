package com.jidongsanshi.operator;

public class OperatorDemo01 {
    public static void main(String[] args) {
        //基本算术运算符 + - * / %
        int a = 10;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);//表达式最终结果为int int舍弃小数点后的
        System.out.println(a * 1.0 / b);//可以把结果转成double
        System.out.println(a % b);
    }
}
