package com.jidongsanshi.branch;

/*
        使用if分支结构解决问题
 */
public class IfDemo01 {
    public static void main(String[] args) {
        //心率在60-100之前是正常的 否则系统提示进一步检查
        //第一种if分支结构 if ...
        int beat = 80;
        if(beat<60||beat>100){
            System.out.println("你的心跳是"+beat+"需要进一步检查");
        }
        System.out.println("检查结束");

        //第二种if格式 if... else...
        //发红包案例
        double money = 1000;
        if(money>1314){
            System.out.println("发送红包成功");
        }else {
            System.out.println("你自己都没钱 就别发红包了");
        }

        //第三种 if格式 if... elseif ... elseif... else...
        //绩效系统 0-60 C 60-80 B  80-90 A 90-100 S
        int score = 86;
        if(score>=0&&score<60){
            System.out.println("本月绩效C");
        }else if(score>=60&&score<80){
            System.out.println("本月绩效B");
        }else if(score>=80&&score<90){
            System.out.println("本月绩效A");
        }else if(score>=90&&score<=100){
            System.out.println("本月绩效S");
        }else {
            System.out.println("分数录入有问题");
        }


    }
}
