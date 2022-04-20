package com.jidongsanshi.param;

public class MethodTest3 {
    //需求 打印整型数字的内容
    public static void arrPrint(int[] arr){
        System.out.print("[");
        if(arr != null && arr.length>0){
            for (int i = 0; i < arr.length; i++) {
//            if(i==arr.length-1){
//                System.out.print(arr[i]);
//            }else {
//                System.out.print(arr[i]+",");
//            }
                System.out.print(i == arr.length-1?arr[i]:arr[i]+",");

            }
        }

        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] age = {12, 35 , 45 ,86};
        arrPrint(age);
    }
}
