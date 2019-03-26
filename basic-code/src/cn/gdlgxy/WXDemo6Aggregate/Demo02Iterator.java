package cn.gdlgxy.WXDemo6Aggregate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
Java.util.Iterator接口：迭代器（对集合进行遍历）
有两个常用方法：
    boolean hasNext() 如果有元素可以迭代，则返回true。
        判断集合中还有没有下一个元素，有就返回true，没有就返回false
    E next() 返回迭代的下一个元素。
        去除集合中的下一个元素
    Iterator迭代器，是一个接口，我们无法直接使用，需要使用Iterator接口的实现类对象，获取实现类的方式比较特殊
    Collection接口中有一个方法，较iterator()，这个方法返回的就是迭代器的实现类对象
        Iterator<E> iterator() 返回在此 collection 的元素上进行迭代的迭代器

    迭代器的使用步骤（重点）：
        1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
        2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
        3.使用Iterator接口中的方法next去除集合中的下一个元素
 */
public class Demo02Iterator {

    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();

        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        coll.add("田七");

        //接口                  实现类对象  （多态写法）
        Iterator<String> it = coll.iterator();
/*
        boolean a = it.hasNext();

        System.out.println(a);

        String b = it.next();

        System.out.println(b);

        //迭代器取出元素的代码是一个重复的过程，可以使用循环优化
        //不知道集合中有多少元素，故使用While循环，结束的条件是hasNEXT返回false
*/
        while(it.hasNext()){

            String c = it.next();
            System.out.println(c);

        }
/*
        System.out.println("==================");

        for(Iterator<String> it2 = coll.iterator();it2.hasNext();){

            String d = it.next();

            System.out.println(d);

        }  for循环写法
*/



    }

}
