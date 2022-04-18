package com.jidongsanshi.random;

import java.util.Random;

public class RandomDemo01 {
    public static void main(String[] args) {
        //Random类的使用
        //1导包
        //2创建random对象
        Random r  = new Random();
        //3调用方法 nextInt(bound) bound表示边界 不含bound
        for (int i=0;i<20;i++) {
            int random =r.nextInt(100);
            System.out.println(random);
        }

        System.out.println("----------------------------");
        //生成1-100之间的随机数
        int data = r.nextInt(100)+1;
        System.out.println(data);

    }
}
