package com.jidongsanshi.create;

public class ArrayDemo04 {
    public static void main(String[] args) {
        //动态初始化数组
        double[] scores = new double[3];//默认数据都是零
        System.out.println(scores[1]);

        //赋值
        scores[2]=98.5;
        System.out.println(scores[2]);


        String[] names = new String[10];//引用类型 默认为 null
        System.out.println(names[1]);

        names[2]="季冬三十";
        System.out.println(names[2]);

    }
        }
