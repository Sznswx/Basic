package cn.gdlgxy.WXDemo3API;
/*
java.util.Math类似数学相关的工具类，里面提供了大量的静态方法，用于完成与数学相关的操作。

public static double obs(double num);获取绝对值
public static double ceil(double num);向上取整
public static double floor(double num);向下取整
public static long round(double num);四舍五入

Math.PI代表近似的圆周率常量(double)。
 */
public class Demo07Math {

    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(-1.3));

        //向上取整
        System.out.println(Math.ceil(2.6));

        //向下取整
        System.out.println(Math.floor(3.5));

        //四舍五入
        System.out.println(Math.round(3.4));
        System.out.println(Math.round(3.5));

        System.out.println(Math.PI);
    }

}
