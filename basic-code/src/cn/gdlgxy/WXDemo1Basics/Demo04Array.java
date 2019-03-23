package cn.gdlgxy.WXDemo1Basics;

public class Demo04Array {

    public static int[] ZHPJ(int a,int b,int c) {//数组返回值类型的方法 返回总和与平均数

        int sum = a + b + c;//总和

        int avg = sum / 3;//平均数

        int[] DB = {sum,avg};//将两个数据打包进数组

        return DB;//返回数组

    }


    public static void main(String[] args) {//主方法

        int SC[]=ZHPJ(1,2,3);//创建一个数组接受方法的返回值，并为方法进行传参

        System.out.println("总和="+ SC[0]);//输出数组的第一个元素 总和

        System.out.println("平均数="+ SC[1]);//输出数组的第二个元素 平均数

    }
}
/*
方法与变量的命名方式：
ZHPJ：总和与平均数
DB：打包
SC：输出
sum：总和
avg：平均数
 */