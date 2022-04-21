package com.jidongsanshi.demo;

public class Test04 {
    //案例四 数组元素复制
    //把一个数组中的元素复制到另一个新数组中去。

    public static void main(String[] args) {
        int[] arr1 = {152, 54, 87, 8, 345};
        int[] arr2 = arrCopy(arr1);

        arrPrint(arr1);
        arrPrint(arr2);
    }

    public static int[] arrCopy(int[] arr) {
        int[] arrcopy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrcopy[i] = arr[i];
        }
        return arrcopy;
    }

    public static void arrPrint(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }
}
