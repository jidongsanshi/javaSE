package com.jidongsanshi.loop;

public class ForTest04 {
    public static void main(String[] args) {
        //水仙花案例
//        水仙花必须满足下面两个条件
//        1水仙花数必须是一个三位数
//        2水仙花的个位十位百位的数字立方和等于原数
//        找出并打印水仙花数 并打印一共有多少个水仙花数
        int count =0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("一共有"+count+"个水仙花数");
    }
}
