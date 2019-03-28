package cn.gdlgxy.WXDemo6Aggregate;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo04Genericity {//泛型

    public static void main(String[] args) {

        show01();
        show02();

    }

    private static void show02() {

        ArrayList<String> list = new ArrayList<>();

        list.add("abc");

    }

    /*
            创建集合对象，不使用泛型：
            好处：
                集合不使用泛型，默认的类型就是Object类型，可以存储任意类型的数据
            弊端：
                不安全，会引发异常
     */
    private static void show01() {

        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);

        Iterator it = list.iterator();

        while (it.hasNext()){
            //取出的元素也是Object类型
            Object obj = it.next();
            System.out.println(obj);

            //想要使用String类的特有方法，需要向下转型
            //会抛出ClassCastException类型的异常，不能把Integer类型转换为String类型
        }

        /*
        创建集合对象，使用泛型
        好处：1.避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型
             2.把运行期异常，提升到了编译期异常
        弊端：泛型是什么类型，就只能存储什么类型的数据
         */

    }

}
/*
    泛型的通配符：
        ?:代表任意的数据类型
    使用方式：
        不能创建对象使用
        只能作为方法参数使用
 */