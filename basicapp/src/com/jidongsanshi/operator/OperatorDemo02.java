package com.jidongsanshi.operator;

public class OperatorDemo02 {
    public static void main(String[] args) {
        //+符号做连接符的识别
        //能算就算 不能算的连起来
        int a = 5;
        System.out.println("abc" + 'a');
        System.out.println("abc" + a);//拿变量的值连起来
        System.out.println(5 + a);
        System.out.println("abc" + 5 + a);
        System.out.println(15 + "abc" + 15);
        System.out.println(a + 'a');
        System.out.println(a + "" + 'a');
        System.out.println(a + 'a' + "jidongsanshi");
        System.out.println("jidongsanshi" + a + 'a');
        System.out.println("jidongsanshi" + (a + 'a'));
    }
}
