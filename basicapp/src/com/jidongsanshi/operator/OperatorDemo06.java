package com.jidongsanshi.operator;

public class OperatorDemo06 {
    public static void main(String[] args) {
        //逻辑运算符 & | ! ^
        //举例  手机筛选
        double size = 6.3;
        double storage = 64;
        //尺寸大于6.2寸并且储存要大于等于64g
        System.out.println(size>6.2&storage>=64);
        //尺寸要大于6.2或者储存要大于等于128g
        System.out.println(size>6.2|storage>=128);
        System.out.println("----------------------");

        //短路运算符 && 和 ||与& 和 |的区别
        //短路运算符 在第一个条件已经能判断出结果的时候就可以停止后面的判断
        //而&和|无论结果如何 会把所有的条件都会判断完
        int a =100;
        int b =50;
        System.out.println(a>500 && ++b>20);
        System.out.println(b);
        System.out.println(a>500 & ++b>20);
        System.out.println(b);
        System.out.println(a>10|| ++b>20);
        System.out.println(b);
        System.out.println(a>10 | ++b>20);
        System.out.println(b);
    }
}
