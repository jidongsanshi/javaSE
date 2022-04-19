package com.jidongsanshi.create;

public class ArrayDemo05 {
    public static void main(String[] args) {
        //动态初始化数组的默认值
        int[] ages = new int[5];
        System.out.println(ages[0]);//整型数组的默认值为0

        char[] chars = new char[10];//char底层依然存的0
        System.out.println(chars[1]);
        System.out.println((int)chars[2]);

        double[] scores = new double[3];
        System.out.println(scores[0]);//浮点默认为 0.0


        boolean[] booleans =new boolean[5];
        System.out.println(booleans[0]);//boolean默认为false

        String[] strings = new String[5];
        System.out.println(strings[0]);//引用类型默认为null


    }
}
