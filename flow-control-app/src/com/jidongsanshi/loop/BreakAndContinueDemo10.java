package com.jidongsanshi.loop;

public class BreakAndContinueDemo10 {
    public static void main(String[] args) {
        //break和continue
        //场景 有老婆 惹生气 让我洗碗五天 洗到第三天就原谅了
        for (int i = 0; i < 5; i++) {
            System.out.println("洗碗碗");
            if(i==2){
                break;//第三天结束循环
            }
        }
        System.out.println("------------------------------");
        //continue结束当次循环 但之后的循环要继续
        //场景 罚洗五天碗 第三天心软不用洗了 第四天不解恨 又让继续洗
        for (int j = 0; j < 5; j++) {
            if(j==2)
                continue;
            System.out.println("第"+(j+1)+"天洗碗碗");
        }
    }
}
