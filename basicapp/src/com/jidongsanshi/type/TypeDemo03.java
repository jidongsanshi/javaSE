package com.jidongsanshi.type;

public class TypeDemo03 {
    public static void main(String[] args) {
        //强制类型转换
        int a = 20;
        byte b = (byte) a;
        System.out.println(b);

        int i = 1500;
        byte j = (byte) i;//超出范围了
        System.out.println(i);
        System.out.println(j);

        double db = 54.9;
        int it = (int) db;
        System.out.println(it);//浮点转整型不是四舍五入 而是直接丢弃小数点后的数据
    }
}
