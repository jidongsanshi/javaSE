package com.jidongsanshi.string;

import java.util.Random;

public class StringExec05 {
    //验证码功能
    public static void main(String[] args) {
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQESTUVWXYZ0123456789";
//        System.out.println(data.length());
        Random r = new Random();
        String code = "";
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(data.length());
            char c = data.charAt(index);
            code+=c;

        }
        System.out.println(code);
    }

}
