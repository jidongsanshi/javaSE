package com.jidongsanshi.param;

public class MethodDemo02 {
    public static void main(String[] args) {
        //引用类型的参数传递（传递地址）
        int[] arr ={10,20,30};
        change(arr);
        System.out.println(arr[1]);//100
    }

    public static void change(int[] arr){
        System.out.println(arr[1]);//20
        arr[1]=100;
        System.out.println(arr[1]);//100

    }


}
