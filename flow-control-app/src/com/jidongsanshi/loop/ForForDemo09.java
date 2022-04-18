package com.jidongsanshi.loop;

public class ForForDemo09 {
    public static void main(String[] args) {
        //嵌套循环
        //场景 假如我有女朋友 我惹她生气了 她罚我5天每天说3句我爱你
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("我爱你");
            }
            System.out.println("---------------------------");
        }


        //需求 用*打印四行五列的矩形
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
