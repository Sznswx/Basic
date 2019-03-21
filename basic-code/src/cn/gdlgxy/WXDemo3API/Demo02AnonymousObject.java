package cn.gdlgxy.WXDemo3API;

import java.util.Scanner;

public class Demo02AnonymousObject {//匿名对象



    public static void method(Scanner sc){//用匿名的方式进行传参

        int num = sc.nextInt();

        System.out.println("输入的数字是："+num);

    }

    public static Scanner Sc(){//使用匿名对象的返回值作为方法的参数

        return new Scanner(System.in);

    }

    public static void main(String[] args) {

        new Scanner(System.in);

        method(new Scanner(System.in));

        System.out.println("==================");

        Scanner Sc = Sc();

        int num = Sc.nextInt();

        System.out.println("输入的数字是："+num);

    }
}
