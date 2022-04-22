package com.jidongsanshi.memory;

public class Test {
    //两个变量指向同一个对象的内存运行机制

    public static void main(String[] args) {
        //创建学生对象
        Student s1 = new Student();
        s1.name="张三";
        s1.sex='男';
        s1.hobby="吃饭，睡觉，学习";
        s1.study();

        Student s2 = s1;
        s2.hobby="爱提问";

        System.out.println(s2.name);
        System.out.println(s2.sex);
        System.out.println(s1.hobby);
        s2.study();
    }
}
