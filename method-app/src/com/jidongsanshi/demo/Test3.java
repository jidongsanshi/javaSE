package com.jidongsanshi.demo;

public class Test3 {
    //数组求最值的方法形式
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] testArr = {231,45,89,354,12,9};
        System.out.println("数组中的最大值为"+getMax(testArr));
    }
}
