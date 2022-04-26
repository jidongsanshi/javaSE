package com.jidongsanshi.arraylist;

import java.util.ArrayList;

/**
   案例 集合存储自定义元素并遍历
   需求 定义自定义电影类（名称 分值 演员） 创建三个电影对象 代表三部影片 存入集合中遍历
   《肖生克的救赎》,9.7,罗宾斯
   《霸王别姬》,9.6,张国荣,张丰毅
   《阿甘正传》,9.5,汤姆汉克斯
*/
public class ArrayListTest05 {
    public static void main(String[] args) {

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("《肖生克的救赎》",9.7,"罗宾斯"));
        movies.add(new Movie("《霸王别姬》",9.6,"张国荣,张丰毅"));
        movies.add(new Movie("《阿甘正传》",9.5,"汤姆汉克斯"));

        for (int i = 0; i < movies.size(); i++) {
            System.out.println("电影名称:"+movies.get(i).getName());
            System.out.println("电影评分:"+movies.get(i).getScore());
            System.out.println("电影主演:"+movies.get(i).getActor());
            System.out.println("----------------------------");
        }
    }
}
