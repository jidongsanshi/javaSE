package com.jidongsanshi.operator;

public class OperatorDemo08 {
    public static void main(String[] args) {
        //java中的运算符优先级问题
        //&&的优先级高于||
        System.out.println(10>3||10>3&&10<3);//true
        System.out.println((10>3||10>3)&&10<3);//false
    }
}
