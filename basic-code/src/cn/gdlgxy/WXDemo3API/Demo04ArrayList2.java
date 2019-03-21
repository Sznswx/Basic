package cn.gdlgxy.WXDemo3API;

import cn.gdlgxy.BasicClass.Student;

import java.util.ArrayList;
import java.util.Random;


public class Demo04ArrayList2 {

/*
题目一：生成 6个1-33的随机整数，添加到集合，并遍历集合。
 */
    public static void List1(){

        Random num = new Random();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {

            int n = num.nextInt(33) + 1;

            list.add(n);

        }

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));

        }

    }

/*
题目二：自定义四个学生对象，添加到集合并遍历。
 */

    public static void List2(){

        ArrayList<Student> list = new ArrayList<>();

        Student stu = new Student("wx",18);
        Student stu2 = new Student("xx",20);
        Student stu3 = new Student("ww",21);

        list.add(stu);
        list.add(stu2);
        list.add(stu3);

        for (int i = 0; i < list.size(); i++) {

            Student student = list.get(i);

            System.out.println("姓名："+student.getName()+"，年龄："+student.getAge());

        }



    }




    public static void main(String[] args) {

        //List1();
        List2();

    }








}
