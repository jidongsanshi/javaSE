package com.jidongsanshi.operator;

public class OperatorDemo03 {
    public static void main(String[] args) {
        //自增自减、
        int a =10;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        --a;
        System.out.println(a);
        a--;
        System.out.println(a);
        // 当单独使用的时候 ++/--放在变量前面后面没有任何区别
        //当和表达式一起使用的时候 ++在前是先加再用 ++在后是先用后加
        int b =15;
        System.out.println(b++);//先输出再b+1 15
        System.out.println(b);//16

        System.out.println(++b);//17 先b+1 再输出
        System.out.println(b);//17
        System.out.println("------------------案例---------------");
        int m =5 ;
        int n =8 ;
        int result = m++ + ++m - --n + n-- - m-- + ++n + 3;
        //5 6 7 6
        //8 7 6 7
        //5+7 -7 +7-7 +7+3=15
        System.out.println(m);//6
        System.out.println(n);//7
        System.out.println(result);//15
    }
}
