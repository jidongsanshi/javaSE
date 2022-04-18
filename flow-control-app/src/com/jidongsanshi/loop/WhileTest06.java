package com.jidongsanshi.loop;

public class WhileTest06 {
    //珠穆朗玛峰案例 while
    //珠穆朗玛峰高度8848.86米即8848860毫米 纸张厚度0.1毫米 纸张折多少次 厚度不低于珠穆朗玛峰；
    public static void main(String[] args) {

        double height = 8848860;
        double thickness = 0.1;
        int count =0;
        while(true){
            count++;
            thickness*=2;
            if(thickness>= height)
                break;
        }
        System.out.println("折叠的次数为"+count);
        System.out.println("折叠后的厚度为"+thickness);
    }
}
