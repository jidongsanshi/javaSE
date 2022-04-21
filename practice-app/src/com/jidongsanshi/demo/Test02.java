package com.jidongsanshi.demo;

public class Test02 {
    //案例二 找素数

    //判断101-200之间有多少素数 并输入所有素数

    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <=200; i++) {
            if(judge(i)){
                System.out.print(i+" ");
                count++;
            }

        }
        System.out.println();
        System.out.println("101-200之间一共有"+count+"个素数");
    }

    public static boolean judge(int number){
        for (int i = 2; i < number/2; i++) {
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
