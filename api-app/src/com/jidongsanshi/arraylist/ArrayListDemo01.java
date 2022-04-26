package com.jidongsanshi.arraylist;

import java.util.ArrayList;

public class ArrayListDemo01 {
    //Arraylist 创建和使用
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();

        list.add("java");
        list.add("mysql");
        list.add("季冬三十");
        list.add("季冬三十");
        list.add(23);
        list.add(23.5);
        list.add('中');

        System.out.println(list);
        //按索引添加元素

        list.add(1,"梨子");
        System.out.println(list);
    }
}
