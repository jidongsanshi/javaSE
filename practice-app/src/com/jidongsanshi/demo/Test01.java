package com.jidongsanshi.demo;

import java.util.Scanner;

public class Test01 {
    //案例一
    /* 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
    按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7
    折，经济舱6.5折。
    */

    public static void main(String[] args) {
        //让用户输入机票原价 月份 和仓位类型

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入机票的原价");
        double price = scanner.nextInt();

        System.out.println("请输入机票的月份 1-12");
        int month = scanner.nextInt();

        System.out.println("请选择仓位类型：经济舱or头等舱");
        String type = scanner.next();

        System.out.println("机票优惠后的价格是"+compute(price, month, type));

    }

    public static double compute(double price,int month,String type){

        if(month>=5&&month<=10){
            //旺季
            switch (type){
                case "头等舱":
                     price*=0.9;
                     break;
                case "经济舱":
                    price*=0.85;
                    break;
                default:
                    System.out.println("输入的仓位类型有误");
            }
        }else if(month==11||month==12||month>=1&&month<=4){
            //淡季
            switch (type){
                case "头等舱":
                    price*=0.7;
                    break;
                case "经济舱":
                    price*=0.65;
                    break;
                default:
                    System.out.println("输入的仓位类型有误");
            }
        }else{
            System.out.println("输入的月份有误");
            return -1;
        }
        return price;
    }

}
