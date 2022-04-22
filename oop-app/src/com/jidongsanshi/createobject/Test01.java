package com.jidongsanshi.createobject;

public class Test01 {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.name);
        System.out.println(c.price);
        c.name="宝马";
        c.price=39.8;
        System.out.println(c.name);
        System.out.println(c.price);
        c.star();
        c.run();

        System.out.println("----------------------------");
        Car c2 = new Car();
        c2.name="奔驰";
        c2.price=98.9;
        System.out.println(c2.name);
        System.out.println(c2.price);
        c2.star();
        c2.run();
    }
}
