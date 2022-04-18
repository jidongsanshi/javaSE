package com.jidongsanshi.branch;

public class SwitchDemo02 {
    public static void main(String[] args) {
        //switch分支结构流畅
        String weekday = "周三";
        switch (weekday){
            case "周一":
                System.out.println("修bug");
                break;
            case "周二":
                System.out.println("请大神帮忙");
                break;
            case "周三":
                System.out.println("啤酒龙虾小烧烤");
                break;
            case "周四":
                System.out.println("主动帮新来的女程序员修bug");
                break;
            case "周五":
                System.out.println("今晚吃鸡");
                break;
            case "周六":
                System.out.println("今晚吃鸡");
                break;
            case "周日":
                System.out.println("准备上班");
                break;
            default:
                System.out.println("数据有误");
        }
    }
}
