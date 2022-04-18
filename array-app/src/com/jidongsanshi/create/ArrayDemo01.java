package com.jidongsanshi.create;

public class ArrayDemo01 {
    public static void main(String[] args) {
        //静态初始化定义数组
        //完整格式
        //数据类型[] 数组名称 = new 数据类型 []{元素1,元素2,.....};
        int[] ages = new int[]{22,26,18};



        //简化格式
        //数据类型[] 数组名称 = {元素1,元素2,..... };
        String[] names = {"张三","李四","王五"};
        System.out.println(ages);//数组是引用型变量 储存着内存中的地址信息


    }
}
