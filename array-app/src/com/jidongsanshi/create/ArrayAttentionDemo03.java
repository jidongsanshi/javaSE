package com.jidongsanshi.create;

public class ArrayAttentionDemo03 {
    public static void main(String[] args) {
        //数组注意事项
        //1 数组类型[] 数组名称 也可以写成 数组类型 数组名称[]
        int[] ages1 = {12,15,35};
        int ages2[] = {23,25,65};
        System.out.println(ages1[2]);
        System.out.println(ages2[1]);
        //2什么类型的数组只能存放什么类型的数据
//        String[] names = {"独孤求败","东方不败",23};

        //3数组一旦定义以后 类型和长度就固定了
        int[] ages3 = { 23, 56 ,32 };
//        System.out.println(ages3[3]);//报错 数组长度只有3 不能访问第四个数据

    }
}
