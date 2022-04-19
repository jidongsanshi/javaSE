package com.jidongsanshi.test;

public class ArrayTest02 {
    public static void main(String[] args) {
        //案例 数组求最值
        //需求 求最高的颜值
        int[] faceScore =  {5,9000,10000,20000,9500,-5};

        int max = faceScore[0];
        for (int i = 0; i < faceScore.length; i++) {
            if(faceScore[i]>max){
                max=faceScore[i];
            }
        }

        System.out.println("最高的颜值得分为"+max);

    }
}
