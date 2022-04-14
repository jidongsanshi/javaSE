package com.jidongsanshi.variable;

public class VariableDemo03 {
    public static void main(String[] args) {
        //基本数据类型
        //1 byte 字节型 1字节 范围-128 到 127
        byte bt = 23;
//        byte bt2 = 128;//报错
        //2 short 短整型 2字节
        short st = 31111;
        //3 int 整型 4字节 默认的类型
        int it = 456455215;

        //4 long 长整型 8字节
        long lg1 =15645254;

        //默认写的数字是int 型的 1231546486741虽然没有超过long的范围 但是超过了int的范围
        //如果要想数字为long类型 后面加上L/l
//        long lg2 = 1231546486741;
        long lg3 = 1231546486741L;

        //5 单精度浮点数 float 占4字节
//        float ft1=58.2;//报错
        //默认的写的小数是double类型
        //想把写的小数当成float 后面加上F/f
        float ft2 = 15.6F;

        //6 双精度浮点数 double 占八个字节
        double db=185563.56;


        //7 字符类型 char
        char c1='a';
        char c2 = '中';
//       char c3 ='中国'//报错 只能有一个字符

        //8 布尔类型 一字节 ture false
        boolean bl1 = true;
        boolean bl2 = false;
        System.out.println("===========================");
        //引用数据类型 String
        String sr="季冬三十";



    }
}
