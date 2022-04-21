package com.jidongsanshi.demo;

import java.util.Scanner;

public class Test05 {
    //案例五 评委打分
    //在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。选手的最后得分为：去掉最
    //高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。

    public static void main(String[] args) {
        int[] scores= new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+(i+1)+"个评委的打分");
            scores[i]=scanner.nextInt();
        }

        int max = scores[0];
        int min = scores[0];
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            if(scores[i]>max)
                max=scores[i];
            if(scores[i]<min)
                min=scores[i];
            sum+=scores[i];
        }

        int avg=(sum-max-min)/4;

        System.out.println("选手的最终得分为"+avg);

    }
}
