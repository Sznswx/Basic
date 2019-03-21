package cn.gdlgxy.WXDemo5Exception;

import java.io.FileNotFoundException;

import static cn.gdlgxy.WXDemo5Exception.Demo04try_catch.readFile;

/*
finally代码块
格式：
    try{
        可能产生异常的代码
    }catch(定义一个异常的变量，用来接收try抛出的异常对象){
        异常的处理逻辑，出现异常对象之后，振膜处理异常对象
        一般在工作中，会把异常的信息记录到一个日志中
    }
    ...
    catch(异常类名 变量名){

    }finally{
    无论是否出现异常都会执行
    }
注意：
   1.finally不能单独使用，必须和try一起使用
   2.finally一般用于资源释放（资源回收），无论程序是否出现异常，最后都要资源释放（IO）
   3.如果finally中有return语句，永远返回finally中的结果，避免该情况。
 */
public class Demo06finally {

    public static void main(String[] args) {
        try {
            readFile("d:\\a.txt");
        }catch (FileNotFoundException e)/*定义一个变量e接收异常*/{

            e.printStackTrace();

        }finally {
            System.out.println("资源释放");
        }

        System.out.println("后续代码执行");
    }
}


