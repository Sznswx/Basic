package cn.gdlgxy.WXDemo6Aggregate;

import java.util.ArrayList;
import java.util.Collection;

/*
    增强for循环：底层使用的也是迭代器，使用for循环格式，简化了迭代器的书写
    是JDK1.5后的新特性。
    Collection<E>extends Iterable<E>:所有单列集合都可以使用增强for
    public interface Iterator<T>实现这个接口允许对象为"foreach"语句的目标。

    增强for循环：用来遍历集合和数组

    格式：
        for(集合/数组的数据类型 变量名：集合名/数组名){
            System.out.println(变量名);
        }
*/
public class Demo03foreach {

    public static void main(String[] args) {

        demo01();
        demo02();

    }

    public static void demo01(){ //使用增强for循环遍历数组

        int [] arr = {1,2,3,4};

        for(int i:arr){
            System.out.println(i);
        }

    }

    public static void demo02(){ //使用增强for循环遍历集合

        Collection<String> coll = new ArrayList<>();

        coll.add("a");
        coll.add("b");
        coll.add("c");
        coll.add("d");

        for(String e:coll){

            System.out.println(e);

        }

    }


}
