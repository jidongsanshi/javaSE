package com.jidongsanshi.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
    案例 学生信息系统 展示数据 并按照学号完成搜索
    学生类信息 学号 姓名 年龄 班级
    测试数据：
    "20180302","叶孤城",23,"护理一班"
    "20180303","东方不败",23,"推拿二班"
    "20180304","西门吹雪",26,"中药学四班"
    "20180305","梅超风",26,"神经科2班"

 */
public class ArrayListTest06 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("20180302","叶孤城",23,"护理一班"));
        students.add(new Student("20180303","东方不败",23,"推拿二班"));
        students.add(new Student("20180304","西门吹雪",26,"中药学四班"));
        students.add(new Student("20180305","梅超风",26,"神经科2班"));

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("学号 姓名 年龄 班级");
            System.out.println(s.getStudyNumber()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getClassName());
        }
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入要查询的学生的学号");
            String studyNumber = sc.next();
            Student s = getStudentById(students,studyNumber);
            if(s==null){
                System.out.println("查无此人");
            }else {
                System.out.println("查询到以下信息");
                System.out.println(s.getStudyNumber()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getClassName());
            }

        }
    }

    /**
     * 根据学生的学号查询学生对象返回
     * @param students 储存全部学生对象的集合
     * @param studyNumber 搜索的学生学号
     * @return 学生对象/null
     */
    public static Student getStudentById(ArrayList<Student> students,String studyNumber){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getStudyNumber().equals(studyNumber)){
                return students.get(i);
            }
        }
        return null;
    }

}
