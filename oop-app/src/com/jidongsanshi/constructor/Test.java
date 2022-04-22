package com.jidongsanshi.constructor;

public class Test {
    //认识两种构造器的作用

    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.name);
        System.out.println(c1.price);//默认值

        c1.name="宝马";
        c1.price=38.9;
        System.out.println(c1.name);
        System.out.println(c1.price);

        Car c2 = new Car("奔驰",48.8);
        System.out.println(c2.name);
        System.out.println(c2.price);
    }
}
