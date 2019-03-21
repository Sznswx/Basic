package cn.gdlgxy.WXDemo5Exception;

import java.io.FileNotFoundException;

/*
try...catch:异常处理的第二种方式，自己处理异常
格式：try{
        可能产生异常的代码
    }catch(定义一个异常的变量，用来接收try抛出的异常对象){
        异常的处理逻辑，出现异常对象之后，振膜处理异常对象
        一般在工作中，会把异常的信息记录到一个日志中
    }
    ...
    catch(异常类名 变量名){

    }

    注意：
    1.try中可能会抛出多个异常对象，那么就可以使用多个catch来处理这些异常对象
    2.如果try中产生了异常，那么久会执行catch中的异常处理多机，执行完毕后，继
    续执行try...catch之后的代码，如果try中没有产生异常，那么就不执行catch中
    的异常处理逻辑。
 */
public class Demo04try_catch {

    public static void main(String[] args) {
        try {
            readFile("c:\\a.txt");
        }catch (FileNotFoundException e)/*定义一个变量e接收异常*/{

            System.out.println("传递的文件路径错误");

        }

        System.out.println("后续代码执行");
    }

    public static void readFile(String fileName) throws FileNotFoundException {

        if(!fileName.equals("c:\\a.txt")){

            throw new FileNotFoundException("传递的路径不是c:\\a.txt");

        }

    }



}
