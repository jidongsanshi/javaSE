package com.jidongsanshi.create;

public class MethodDemo02 {
    public static void main(String[] args) {
        //方法的完整定义格式 理解调用和执行流程

        int result =add(100,200);//打上断点 用debug 的step into查看方法调用流程
        System.out.println("和是"+result);
    }

    public static int add(int a, int b){
        return a+b;
    }
}
