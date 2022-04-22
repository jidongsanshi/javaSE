package com.jidongsanshi.createobject;

public class Test02 {

    //1.类名首字母建议大写，且有意义，满足“驼峰模式”。

    //2.一个Java文件中可以定义多个class类，且只能一个类是public修饰，而且public修饰的类名必须成为代码文件名。
    //实际开发中建议还是一个文件定义一个class类。


    //3成员变量的完整定义格式是：修饰符 数据类型 变量名称 = 初始化值； 一般无需指定初始化值，存在默认值。

    //属性的默认值和变量的默认值是一样的
    public static void main(String[] args) {
        Student st =  new Student();
        System.out.println(st.name);

    }



}
