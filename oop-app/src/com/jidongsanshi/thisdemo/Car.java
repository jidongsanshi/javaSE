package com.jidongsanshi.thisdemo;

public class Car {
    String name;
    double price;
    public Car(){
        System.out.println("无参数构造器中的this"+this);
    }
    public void run(){
        System.out.println("方法中的this"+this);
    }

    public Car(String name,double price){
        this.name=name;
        this.price=price;
        /*name=name;
        price=price;//不加this 会就近 只算传进来的name*/
    }
}
