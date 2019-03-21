package cn.gdlgxy.WXDemo3API;

import java.util.Random;

import java.util.Scanner;

public class Demo03Random {

    public static void Random1() {//随机数生成器  生成一个随机数

        Random r = new Random();//使用 Random类创建一个对象

        int num = r.nextInt();//调用 Random类中的 nextInt方法

        System.out.println("生成的随机数为：" + num);//输出随机数

    }

    public static void Random2() {//带有参数的随机数生成器  生成十个随机数

        Random r = new Random();

        System.out.println("生成的十个随机数为：");

        for (int i = 0; i < 10; i++) {

            int num = r.nextInt(3);//使用 nextInt（int bound）方法

            System.out.println(num);
        }
    }

    //习题：根据 int常量 n的值，来获取随机数字，范围是[1,n],可以取到 1，也可以取到 n

    /*我的思路：

    1.定义一个 int变量n，随意赋值
    2.使用 Random类进行随机数生成：导包、创建、使用
    3.使用nextInt（int bound）方法，整体+1即可实现
    4.打印随机数字

     */

    public static void Random3() {

        int n = 9;

        Random r = new Random();

        for (int i = 0; i < 10; i++) {

            int num = r.nextInt(n) + 1;

            System.out.println("生成的随机数为：" + num);

        }

    }

    //习题：编写一个猜数字的小游戏


    public static void Random4() {//猜数字小游戏

        Random r = new Random();//创建一个 Random类对象

        int num = r.nextInt(10);//获取一个[0,10)范围的随机数并赋值给 num

        Scanner sc = new Scanner(System.in);//创建一个键盘输入的对象

        while (true) {//创建一个死循环

            int num1 = sc.nextInt();//获取键盘输入的数字并赋值给 num1

            if (num1 > num) {//使用 if语句开始比较键入数字与随机数的大小

                System.out.println("你输入的数字太大了！");

            } else if (num1 < num) {

                System.out.println("你输入的数字太小了！");

            } else {

                System.out.println("回答正确！");

                break;//回答正确后跳出循环

            }
        }

        System.out.println("游戏结束！");

    }

/*
    public static void main(String[] args) {

        Random1();

        System.out.println("====================");

        Random2();

        System.out.println("====================");

        Random3();

        System.out.println("====================");

        Random4();

    }

*/
}