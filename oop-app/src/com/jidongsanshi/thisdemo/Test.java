package com.jidongsanshi.thisdemo;

public class Test {
    //this 关键字的含义

    public static void main(String[] args) {
        Car c = new Car();
        c.run();
        System.out.println(c);
        //三个输出的都是c的地址

        System.out.println("-----------");
        Car c2 = new Car("奔驰",39.8);
        System.out.println(c2.name);
        System.out.println(c2.price);
    }
}
