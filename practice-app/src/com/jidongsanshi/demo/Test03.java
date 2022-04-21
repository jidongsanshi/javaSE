package com.jidongsanshi.demo;

import java.util.Random;

public class Test03 {
    //案例三 生成随机验证码

    //定义方法实现随机产生一个5位的验证码，每位可能是数字、大写字母、小写字母。

    public static void main(String[] args) {
        System.out.println("五位随机验证码为" + getCode(5));
    }


    public static String getCode(int length) {
        String code = "";
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int type = random.nextInt(3);
            switch (type) {
                case 0:
                    //大写字符(A 65 - Z 65+25)
                    char ch = (char) (random.nextInt(26) + 65);
                    code += ch;
                    break;
                case 1:
                    //小写字符(a97 - z97+25)
                    char ch1 = (char) (random.nextInt(26) + 97);
                    code += ch1;
                    break;
                case 2:
                    //数字
                    code += random.nextInt(10);
                default:
                    break;
            }
        }
        return code;
    }
}
