package com.jidongsanshi.returndemo;

public class ReturnDemo01 {
    //return 关键字的作用
    public static void main(String[] args) {
        chu(10,0);

    }


    public static void chu(int a,int b){
        if(b==0){
            System.out.println("除数不能为0");
            return;//立即跳出方法
        }
        int c = a/b;
        System.out.println("结果是"+c);
    }
}
