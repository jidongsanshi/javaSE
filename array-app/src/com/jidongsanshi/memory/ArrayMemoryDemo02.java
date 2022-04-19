package com.jidongsanshi.memory;

public class ArrayMemoryDemo02 {
    public static void main(String[] args) {
        //两个数组指向听一个数组
        int[] arr ={11,22,33};

        int[] arr2 = arr;
        System.out.println(arr);
        System.out.println(arr2);


        arr2[1]=99;
        System.out.println(arr[1]);


    }
}
