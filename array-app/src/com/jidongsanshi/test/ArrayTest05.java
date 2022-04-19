package com.jidongsanshi.test;

public class ArrayTest05 {
    public static void main(String[] args) {
        // 冒泡排序
        // 定义一个数组

        int[] arr = {5, 8, 1, 9};

        //定义一个循环控制比较的轮数
        for (int i = 1; i < arr.length; i++) {
            //i==1 比较的次数3       j = 0 1 2
            //i==2 比较的次数2       j = 0 1
            //i==3 比较的次数1       j = 0
            for (int j = 0; j < arr.length - i -1; j++) {
                //判断j当前位置的元素值 是否大于后一个位置 若较大 则交换
                if (arr[i] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                }
            }

        }

        //遍历数组内容输出
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
