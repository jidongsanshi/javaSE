package com.jidongsanshi.param;

public class MethodTest4 {
    //从数组中查询指定的元素的索引 不存在则返回-1
    public static void main(String[] args) {
        int[] arr = {14,65,87,13,68,95};
        System.out.println(searchIndex(arr,65));//1
        System.out.println(searchIndex(arr,25));//-1
    }

    public static int searchIndex(int[] arr,int data){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==data) {
                return i;
            }

        }
        return -1;
    }
}
