package com.jidongsanshi.shoppingcart;

import java.util.Scanner;

public class ShoppingCartDemo {
    //模拟购物车模块 案例

    //需求
    /*模拟购物车模块的功能，需要实现添加商品到购物车中去，同时需要提供修改商品的
    购买数量，结算商品价格功能*/

    public static void main(String[] args) {
        //1定义一个商品类
        //2定义一个购物车数组
        Goods[] shoppingCart = new Goods[100];

        //3搭建操作架构
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("输入以下命令进行操作：");
            System.out.println("添加商品到购物车：add");
            System.out.println("查询商品到购物车：query");
            System.out.println("修改商品购买数量：update");
            System.out.println("结算购买的商品的金额：pay");
            System.out.println("退出购物车：quit");
            System.out.println("请输入命令：");

            String command = sc.next();
            if(command.equals("quit")){
                break;
            }
            switch (command){
                case "add":
                    //添加商品到购物车
                    addGoods(shoppingCart);
                    break;
                case "query":
                    //查询购物车商品展示
                    queryGoods(shoppingCart);
                    break;
                case "update":
                    //修改商品的购买数量
                    updateGoods(shoppingCart);
                    break;
                case "pay":
                    //结算金额
                    pay(shoppingCart);
                    break;
                default:
                    System.out.println("输入的命令有误！");
            }
        }
    }

    public static void pay(Goods[] shoppingCart) {
        double sum = 0;
        for (int i = 0; i < shoppingCart.length; i++) {
            if(shoppingCart[i]!=null){
                sum+=shoppingCart[i].price*shoppingCart[i].count;
            }else {
                break;
            }

        }
        System.out.println("总共支付"+sum+"元");

    }

    public static void updateGoods(Goods[] shoppingCart) {
        System.out.println("请输入要修改数量的商品的编号");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int index = 0;
        Boolean isFound=true;
        for (int i = 0; i < shoppingCart.length; i++) {
            if(shoppingCart[i].id==id){
                index=i;
                break;
            }
        }
        if(isFound){
            System.out.println("请输入你要更新的商品数量");
            int updateCount =sc.nextInt();
            shoppingCart[index].count=updateCount;
            System.out.println("修改完成");
            queryGoods(shoppingCart);
        }else {
            System.out.println("找不到编号对应的商品！");
        }
    }

    public static void queryGoods(Goods[] shoppingCart) {
        System.out.println("------------------------查询购物车信息如下------------------------");
        for (int i = 0; i < shoppingCart.length; i++) {
            if (shoppingCart[i]!=null) {
                System.out.println("第"+(i+1)+"件商品:");
                System.out.print("编号:"+shoppingCart[i].id+"  ");
                System.out.print("名称:"+shoppingCart[i].name+"  ");
                System.out.print("价格:"+shoppingCart[i].price+"  ");
                System.out.println("数量:"+shoppingCart[i].count+"  ");
            }else {
                break;
            }

        }
    }

    public static void addGoods(Goods[] shoppingCart) {
        Goods goods = new Goods();
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入商品的id");
        goods.id=sc.nextInt();
        System.out.println("请输入商品的名称");
        goods.name=sc.next();
        System.out.println("请输入商品的数量");
        goods.count=sc.nextInt();
        System.out.println("请输入商品的价格");
        goods.price= sc.nextDouble();

        for (int i = 0; i < shoppingCart.length; i++) {
            if(shoppingCart[i]==null){
                shoppingCart[i]=goods;
                break;
            }
        }
        System.out.println("商品已经添加到购物车中");

    }
}
