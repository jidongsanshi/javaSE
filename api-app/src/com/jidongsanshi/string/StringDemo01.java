package com.jidongsanshi.string;

public class StringDemo01 {
    //String类创建字符串的两种方式
    public static void main(String[] args) {
        //方式一：直接使用双引号得到字符串对象
        String name = "张三";
        System.out.println(name);
        //方式二
        //1 public String(): 创造一个空字符串 几乎不用
        String s1 = new String();
        System.out.println(s1);

        //2 public String(String): 根据传入的字符串创建字符串 几乎不用
        String s2 = new String("张三");
        System.out.println(s2);

        //3 public String(char[] c):根据字符数组的内容 创建字符串对象
        char[] c = {'张','三'};
        String s3 = new String(c);
        System.out.println(s3);

        //4 public String(byte[] b)：根据字节数组的内容 来创建字符串对象
        byte[] bytes = {65,48,65,96,35,45};
        String s4 = new String(bytes);
        System.out.println(s4);

        System.out.println("------------------------------");
        String string1 = "abc";
        String string2 = "abc";
        System.out.println(string1==string2);

        char[] chars = {'a','b','c'};
        String string3 = new String(chars);
        String string4 = new String(chars);
        System.out.println(string3==string4);
    }
}
