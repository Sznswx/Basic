package cn.gdlgxy.WXDemo3API;

import java.util.Scanner;//导入Scanner包

public class Demo01Scanner {


    public static void num(){ //输入int类型的数据  方法

        Scanner sc = new Scanner(System.in);//创建一个新的对象，System.in （从键盘输入）

        int num = sc.nextInt();//创建一个int型的变量接受Scanner对象的返回值

        System.out.println("输入的数字："+num);//输出num

    }

    public static void str(){//输入String类型数据  方法

        Scanner sc1 = new Scanner(System.in);//创建一个新的对象，System.in （从键盘输入）

        String str = sc1.next();//创建一个String型的变量接受Scanner对象的返回值

        System.out.println("输入的字符串："+str);//输出str

    }

    public static void sum(){

        System.out.println("请输入要进行加法的两个数：");

        Scanner sc2 = new Scanner(System.in);//创建一个新的对象，System.in （从键盘输入）  ！创建一个对象即可！

        int num1 = sc2.nextInt();//创建一个int型的变量接受Scanner对象的返回值

        int num2 = sc2.nextInt();//创建一个int型的变量接受Scanner对象的返回值

        int num3 = num1 + num2;//求和语句

        System.out.println("两数之和为："+num3);//输出结果

    }

    public static void BDX(){//输入三个数字比大小  方法

        Scanner sc3 = new Scanner(System.in);//创建一个新的对象，System.in （从键盘输入）  ！创建一个对象即可！

        System.out.println("请输入第一个数字：");

        int num1 = sc3.nextInt();//创建一个int型的变量接受Scanner对象的返回值

        System.out.println("请输入第二个数字：");

        int num2 = sc3.nextInt();//创建一个int型的变量接受Scanner对象的返回值

        System.out.println("请输入第三个数字：");

        int num3 = sc3.nextInt();//创建一个int型的变量接受Scanner对象的返回值


 /*       使用三元运算符进行大小比较：

        int temp = num1 > num2 ? num1 : num2;
        int max = num3 > temp ? num3 : temp;

        System.out.println("三个数最大的是："+ max);
*/

//        使用数组 + 循环的方法进行大小比较：

        int num[] = {num1,num2,num3};//创建一个数组将三个变量打包起来

        int max = num[0];

        for (int i = 1; i < num.length; i++) {//使用for循环遍历数组

            if(num[i] > max){//使用if语句进行大小比较

                max = num[i];//创建一个int变量接受判断语句的返回值

                System.out.println("三个数最大的是："+ max);//输出最大的数字
            }
        }



    }



    public static void main(String[] args) {

        num();//从键盘输入int型变量  方法

        System.out.println("==============");

        str();//从键盘输入String型变量  方法

        System.out.println("==============");

        sum();//将键盘输入的数字进行加法运算

        System.out.println("==============");

        BDX();//将键盘输入的三个数字进行大小比较


    }
}
