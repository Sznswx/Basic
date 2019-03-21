package cn.gdlgxy.WXDemo5Exception;
/*
throws关键字：异常处理的第一种方式，交给别人处理
作用：当方法内部抛出异常对象的时候，那么我们就必须处理这个异常对象
     可以使用throws关键字处理异常对象，会把异常对象声明抛出给方法调用者处理
     （自己不处理，给别人处理），追踪交给JVM --> 中断处理
使用格式：在方法声明时使用
    修饰符 返回值类型 方法名（参数列表） throws XXXException，YYYException...{
        throw new XXXException("产生原因");
        throw new YYYException("产生原因");
        ...
    }
注意：
1.throws关键字必须写在方法生命处
2.throws关键字后边声明的异常必须是Exception或者它的子类
3.方法内部如果抛出了多个异常对象，那么throws后边也必须声明多个异常
  如果抛出的多个异常对象有子父类关系，那么直接声明父类异常即可。
4.调用了一个声明抛出异常的方法，我们就必须处理声明异常
  要么继续使用throws声明抛出，交给方法的调用者处理，最终交给JVM
  要么try...catch自己处理异常
 */

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo03throws {
    /*
    定义一个方法，对传递的文件路径进行合法性判断
    如果路径不是xxxxx，那么我们就抛出文件找不到异常对象，告知方法的调用者
     */
    public static void main(String[] args) throws IOException {

        readFile("d:\\a.txt");

    }

    public static void readFile(String fileName) throws IOException {

        if(!fileName.endsWith(".txt")){

            throw new IOException("文件的后缀名不对");

        }

        if(!fileName.equals("c:\\a.txt")){

            throw new FileNotFoundException("传递的文件路径不是c:\\a.txt");

        }



        System.out.println("传递的路径正常，开始读取");

    }

}
