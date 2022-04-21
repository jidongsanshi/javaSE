package com.jidongsanshi.demo;

import java.util.Scanner;

public class Test06 {
    //案例六 数字加密
    //某系统的数字密码，比如1983，采用加密方式进行传输，规则如下：先得到每位数，然后每位数都加上
    //5 , 再对10求余，最后将所有数字反转，得到一串新数。

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入需要加密的数字");

        String number = scanner.next();

        int[] arr = new int[number.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number.charAt(i) - 48;
        }
        arrPrint(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

        arrPrint(arr);
        System.out.println(tostring(arr));
    }

    public static void arrPrint(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }

    public static String tostring(int[] arr) {
        String result = "";
        for (int i = 0; i <arr.length; i++) {
            result += arr[i];
        }
        return result;
    }
}
