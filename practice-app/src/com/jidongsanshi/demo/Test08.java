package com.jidongsanshi.demo;

import java.util.Random;
import java.util.Scanner;

public class Test08 {
    //双色球系统
    public static void main(String[] args) {

        int[] luckyNumbers = createLuckNumber();
        int[] userNumbers = inputUserNumbers();
        judge(luckyNumbers, userNumbers);

    }


    public static int[] createLuckNumber() {
        //生成随机的中奖号码
        int[] luckNumbers = new int[7];
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            //遍历前六个位置 生成六个不重复的红球号码 范围1-33

            while (true) {
                int data = random.nextInt(33) + 1;
                //判断此次随机的号码之前是否重复过
                boolean isRepeat = false;
                for (int j = 0; j < i; j++) {
                    if (luckNumbers[j] == data) {
                        isRepeat = true;
                        break;
                    }
                }
                if (isRepeat == false) {
                    luckNumbers[i] = data;
                    break;
                }
            }
        }

        //生成蓝球号码 生成一个1-16的号码

        luckNumbers[luckNumbers.length - 1] = random.nextInt(16) + 1;
        return luckNumbers;
    }

    public static int[] inputUserNumbers() {
        int[] userNumbers = new int[7];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入第" + (i + 1) + "个红球号码 1-33 不重复");
            userNumbers[i] = scanner.nextInt();
        }

        System.out.println("请输入蓝球号码 1-16");
        userNumbers[6] = scanner.nextInt();
        return userNumbers;
    }

    public static void judge(int[] lucyNumbers, int[] userNumbers) {
        int redHitNumbers = 0;
        int blueHitNumbers = 0;
        if (lucyNumbers[lucyNumbers.length - 1] == userNumbers[userNumbers.length - 1]) {
            blueHitNumbers = 1;
        }
        for (int i = 0; i < lucyNumbers.length - 1; i++) {
            for (int j = 0; j < userNumbers.length - 1; j++) {
                if (lucyNumbers[i] == userNumbers[j]) {
                    redHitNumbers++;
                    break;
                }
            }
        }


        System.out.println("中奖号码为");
        printArr(lucyNumbers);
        System.out.println("您投注的号码为");
        printArr(userNumbers);
        System.out.println("您命中红球个数： "+ redHitNumbers);
        System.out.println("您命中蓝球个数： "+ blueHitNumbers);


        switch (blueHitNumbers) {
            case 0:
                switch (redHitNumbers) {
                    case 4:
                        System.out.println("恭喜你中奖了 奖金为10元");
                        break;
                    case 5:
                        System.out.println("恭喜你中奖了 奖金为200元");
                        break;
                    case 6:
                        System.out.println("恭喜你中奖了 奖金为500万");
                        break;
                    default:
                        System.out.println("很遗憾你没有中奖");
                        break;
                }
                break;
            case 1:
                switch (redHitNumbers) {
                    case 0:
                    case 1:
                    case 2:
                        System.out.println("恭喜你中奖了 奖金为5元");
                        break;
                    case 3:
                        System.out.println("恭喜你中奖了 奖金为10元");
                        break;
                    case 4:
                        System.out.println("恭喜你中奖了 奖金为200元");
                        break;
                    case 5:
                        System.out.println("恭喜你中奖了 奖金为3000元");
                        break;
                    case 6:
                        System.out.println("恭喜你中奖了 奖金为1000万");
                        break;
                    default:
                        System.out.println("很遗憾你没有中奖");
                        break;
                }

        }
    }

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
