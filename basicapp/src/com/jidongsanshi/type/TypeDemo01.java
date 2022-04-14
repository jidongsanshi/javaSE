package com.jidongsanshi.type;

public class TypeDemo01 {
    public static void main(String[] args) {
        //自动类型转换
        byte a = 35;
        int b = a;//发生了自动类型转换 范围小的可以自动转为范围大的
        System.out.println(a);
        System.out.println(b);


        int age=21;
        double db=age;//自动转换 小转大 整型转浮点
        System.out.println(db);

        char c ='a';
        int code = c;//字符的编码可以转换为int
        System.out.println(code);
    }
}
