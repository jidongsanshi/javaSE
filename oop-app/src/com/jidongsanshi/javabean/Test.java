package com.jidongsanshi.javabean;

public class Test {
    //JavaBean的书写要求
    public static void main(String[] args) {
        //1 无参数构造器创建对象封装一个用户信息
        User u1 = new User();
        u1.setHeight(183);
        u1.setName("季冬三十");
        u1.setSalary(1000.0);

        System.out.println(u1.getHeight());
        System.out.println(u1.getName());
        System.out.println(u1.getSalary());


        //2 有参数构造器创建一个对象封装用户信息

        User u2 = new User("张三",156,30000);
        System.out.println(u2.getSalary());
        System.out.println(u2.getHeight());
        System.out.println(u2.getName());
    }
}
