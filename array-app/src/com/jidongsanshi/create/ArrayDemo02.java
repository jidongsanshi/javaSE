package com.jidongsanshi.create;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //访问数组中的元素
        int[] ages ={12, 21, 38};

        //取值 数组名称[索引]
        System.out.println(ages[2]);

        //赋值 数组名称[索引] = 数据;
        ages[1] = 25;
        System.out.println(ages[1]);

        //访问数组长度 数组名称.length
        System.out.println(ages.length);
    }
}
