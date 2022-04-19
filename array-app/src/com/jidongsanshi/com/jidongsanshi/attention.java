package com.jidongsanshi.com.jidongsanshi;

public class attention {
    public static void main(String[] args) {
        //数组索引越界异常
        int[] arr = {11,22,33};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
//        System.out.println(arr[3]);//报错 数组越界异常  ArrayIndexOutOfBoundsException

        //如果数组变量中没有存储数组的地址，而是null 在访问的内容时候会出现空指针异常
        arr=null;
        System.out.println(arr);//null

//        System.out.println(arr.length);//出现异常 NullPointerException


    }

}
