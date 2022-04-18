package com.jidongsanshi.branch;

public class SwitchDemo03 {
    public static void main(String[] args) {
        //switch 的注意事项
        //表达式的类型只能是byte int char jdk7开始支持String 不支持 float double long
        double a = 1.0 + 3.4;//double 的值不够精确 会导致bug
        System.out.println(a);
//        switch (a){
//
//        }
        //case的值不容许重复 且必须是字面量 不能是变量
//        switch (3) {
//            case 3:
//                break;
//            case 3:
//                break;
//        }
        //不要忘记写 break 不然会出现穿透现象

    }
}
