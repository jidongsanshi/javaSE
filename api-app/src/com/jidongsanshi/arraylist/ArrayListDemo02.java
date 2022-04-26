package com.jidongsanshi.arraylist;

import java.util.ArrayList;

/**
    目标 能够使用泛型约束ArrayList集合操作的数据类型
*/
public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("java");
        list.add(23);
        list.add(23.5);


        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("mysql");
//        stringList.add(23);//报错
    }
        }
