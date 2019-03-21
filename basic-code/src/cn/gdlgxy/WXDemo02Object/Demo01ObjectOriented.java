package cn.gdlgxy.WXDemo02Object;

import java.util.Arrays;

public class Demo01ObjectOriented {//理解面向对象与面向过程变成的区别


    public static void GC(){//面向过程 每一步亲力亲为

        int[] DX = {0,1,2,3,4,5,6};//创建一个数组

        System.out.print("[");

        for (int i = 0; i <DX.length ; i++) {//创建一个不需要换行的打印循环

            if(i == DX.length - 1) {//加入判断语句，判断是加" , "还是" ] "

                System.out.println(DX[i]+"]");

            }

            else{

                System.out.print(DX[i] + ", ");

            }

        }
    }

    public static void DX(){//调用方法，找人做事

        int[] DX2 = {0,1,2,3,4,5,6};//创建一个数组

        System.out.println(Arrays.toString(DX2));//使用Arrays.toString方法打印语句

    }

    public static void main(String[] args) {//主函数

        GC();//面向过程的方法

        System.out.println("=====================");

        DX();//面向对象的方法

    }

}
