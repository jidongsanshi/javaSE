package com.jidongsanshi.create;

public class ArrayTraverseDemo06 {
    public static void main(String[] args) {
        //数组的遍历
        int[] arr ={16,56,94,85,35,15};
        
        //for循环遍历
        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("------------------------------");
        //.length
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("--------------------------------");
        //快捷键 arr.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
