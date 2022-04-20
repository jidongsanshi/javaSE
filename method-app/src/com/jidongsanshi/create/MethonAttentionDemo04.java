package com.jidongsanshi.create;

public class MethonAttentionDemo04 {
    public static void main(String[] args) {
        //方法的编写顺序无所谓
        //方法和方法之间是平级关系 不能嵌套
        //方法的返回值类型为void 方法内部不能使用return返回数据 如果写了返回值类型 则必须return相对应的数据
        //rerun 语句下面不能再写语句 因为永远执行不到 属于无效代码
        //有返回值的方法调用时可以选择定义变量接收结果 或者直接输出调用 甚至直接调用 无返回值的方法只能直接调用
        //方法不掉用不执行 调用时必须严格匹配方法的参数情况
        int result = sum(100,300);//可以接收
        print();//只能直接调用

    }

    public static int sum (int a,int b){
        return a+b;
//        System.out.println("hello");//执行不到 报错
    }
    public static void print(){
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
//        return 13;//报错 void不能return
    }
}
