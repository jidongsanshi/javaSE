package com.jidongsanshi.arraylist;

import java.util.ArrayList;

//遍历并删除元素
public class ArrayListTest04 {
    //需求 将班级学生分数用ArrayList存储 然后遍历 将八十分以下的成绩移除


    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(100);
        System.out.println(scores);

/*        for (int i = 0; i < scores.size(); i++) {
            if(scores.get(i)<80){
                scores.remove(i);
            }
        }
        System.out.println(scores);*/
        //因为移除元素后 后面的元素会往前移动 所以会出bug

        //方案一
/*        for (int i = 0; i < scores.size(); i++) {
            if(scores.get(i)<80){
                scores.remove(i);
                i--;//移除数据后 i往后退一步
            }
        }
        System.out.println(scores);*/

        //方案二 倒着遍历 不会出错
        for (int i = scores.size()-1; i >=0; i--) {
            if(scores.get(i)<80){
                scores.remove(i);
            }
        }
        System.out.println(scores);


    }
}
