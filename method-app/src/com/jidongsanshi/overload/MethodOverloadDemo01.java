package com.jidongsanshi.overload;

public class MethodOverloadDemo01 {
    //案例 发射武器 可以默认发射一枚 可以向指定地区发一枚 可以向指定地区 发射指定数量

    public static void main(String[] args) {
        fire();
        fire("霓虹");
        fire("米国",100);
    }

    public static void fire(){
        System.out.println("默认向米国发射一枚导弹");
    }

    public static void fire(String location){
        System.out.println("向"+location+"发射一枚导弹");
    }

    public static void fire(String location,int number){
        System.out.println("向"+location+"发射"+number+"枚导弹");
    }
}
