package cn.gdlgxy.WXDemo5Exception;
/*
throw关键字
作用：可以使用throw关键字在指定的方法中抛出指定的异常
使用格式：
    throw new xxxException("异常产生的原因");
注意：
1.throw关键字必须写在方法的内部
2.throw关键字后边new的对象必须是Exception或者Exception的子类对象
3.throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
    throw关键字后边创建的是RuntimeException或者是它的子类对象，我们可以不处理，默认交给虚拟机处理(打印异常对象，中断程序)
    throw关键字后边创建的是编译异常(写代码的时候报错)，我们就必须处理这个异常，要么throw，要么try...catch
 */
public class Demo01throw {

    public static void main(String[] args) {

        int arr[] = {1,2,3};

        int e = arr1(arr,4);

        System.out.println(e);

    }

    /*
    我们可以对传递过来的参数数组，进行合法性校验
    如果数组arr的值是NULL
    那么我们就抛出空指针异常，告知方法的调用者"传递的数组的值是NULL"
     */

    public static int arr1(int arr[],int index){

        if(arr == null){

            throw new NullPointerException("数组的值为NULL");

        }

        if (index<0||index > arr.length - 1){

            throw new ArrayIndexOutOfBoundsException("数组索引越界");

        }

        int num = arr[index];

        return num;

    }
/*
运行期异常我们不用处理，默认交给JVM处理。
 */

}
