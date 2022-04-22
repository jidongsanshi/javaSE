package com.jidongsanshi.encapsulation;

public class Student {
    private int age;//private修饰 只能在本类内访问

    public void setAge(int age){
        if(age>=0&&age<=200){
            this.age=age;
        }
        else{
            System.out.println("设置的年龄有误");
        }
    }

    public int getAge(){
        return age;
    }

}
