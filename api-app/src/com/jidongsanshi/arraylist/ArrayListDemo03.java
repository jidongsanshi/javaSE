package com.jidongsanshi.arraylist;

import java.util.ArrayList;

/**
 * 掌握ArrayList集合的常用api
 */
public class ArrayListDemo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("Mysql");
        list.add("MyBatis");
        list.add("HTML");

//        public E get(int index) 返回指定索引处的元素
        System.out.println(list.get(3));
//        public int size() 返回集合中的元素的个数
        System.out.println(list.size());
//        public E remove(int index) 删除指定索引处的元素，返回被删除的元素
        System.out.println(list.remove(1));
        System.out.println(list);
//        public boolean remove(Object o) 删除指定的元素，返回删除是否成功
        System.out.println(list.remove("Mysql"));
        System.out.println(list);
//        public E set(int index,E element) 修改指定索引处的元素，返回被修改的元素
        System.out.println(list.set(2, "HTML5"));
        System.out.println(list);


    }
}
