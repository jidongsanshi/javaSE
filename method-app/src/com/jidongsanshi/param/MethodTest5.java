package com.jidongsanshi.param;

public class MethodTest5 {
    //比较两个数组是否一样
    //类型 元素个数 元素顺序 元素内容都一样
    //判断两个整型数组是否相同 返回boolean值

    public static void main(String[] args) {
        int[] arr1 = {12,14,15,16};
        int[] arr2 = {12,14,15,16};
        int[] arr3 = {154,15,688};

        System.out.println(compare(arr1,arr2));
        System.out.println(compare(arr1,arr3));
    }

    public static boolean compare(int[] arr1, int[] arr2){
        if(arr1.length==arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i]!=arr2[i]){
                    return false;
                }

            }
            return true;
        }
        return false;
    }
}
