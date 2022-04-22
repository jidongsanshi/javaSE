package com.jidongsanshi.demo;

import java.util.Random;

public class Test07 {
    //案例七 抢红包
    //一个大V直播抽奖，奖品是现金红包，分别有{2, 588 , 888, 1000, 10000}五个奖金。请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。

    public static void main(String[] args) {
        int[] bonus = {2,588,888,1000,10000};
        Random random = new Random();
        int[] outBonus = new int[5];
        int count=5;
        while (count>0){
            int order = random.nextInt(5);
            boolean isOut = false;
            for (int i = 0; i < outBonus.length; i++) {
                if(bonus[order]==outBonus[i]){
                    isOut = true;
                    break;
                }
            }
            if(isOut==false){
                outBonus[order]=bonus[order];
                System.out.println(bonus[order]+"元的奖金已经被抽取");
                count--;
            }
        }
    }


}
