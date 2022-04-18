package com.jidongsanshi.branch;

public class SwitchDemo04 {
    public static void main(String[] args) {
        //switch 的穿透运用
        //需求用户输入月份可以展示该月的天数
        int month = 10;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month+"月的天数为31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month+"月的天数为30天");
                break;
            case 2:
                System.out.println(month+"月闰年的天数为29天 非闰年的天数为28天");
                break;
            default:
                System.out.println("数据有误");
        }
    }
}
