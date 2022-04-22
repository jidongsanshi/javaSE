package com.jidongsanshi.encapsulation;

public class Test1 {
    //更好的封装对象
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(35);
        System.out.println(s.getAge());
        s.setAge(300);
    }
}
