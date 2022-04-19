package com.jidongsanshi.create;

public class MethodDemo01 {
    public static void main(String[] args) {
        //方法的的使用和优点
        //可以提高的代码的复用性和开发效率
        //让程序的逻辑更加清晰

        int a =50;
        int b =30;
        System.out.println(sum(a, b));


    }
    public static int sum(int a ,int b){
        return a+b;
    }
}
