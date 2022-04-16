package com.jidongsanshi.type;

public class TypeDemo02 {
    public static void main(String[] args) {
        //表达式的自动类型转换规则
        byte a =2;
        int b = 98;
        double c =12.5;
        double result =a + b + c;//结果是最大范围的
        System.out.println(result);

        //易错题
        byte i = 2;
        byte j = 5;
        int result2 = i + j;// byte short char 在表达式里一律转为 int 类型计算
        System.out.println(result2);


    }
}
