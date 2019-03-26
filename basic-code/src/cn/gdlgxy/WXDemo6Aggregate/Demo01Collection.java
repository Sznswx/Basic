package cn.gdlgxy.WXDemo6Aggregate;

import java.util.ArrayList;
import java.util.Collection;

/*
Collection是所有单列集合的父接口，因此在Collection中定义了单列集合（List与Set）通用的一些方法，
这些方法可用于操作所有的单列集合。方法如下：
1.public boolean add(E e)     :把给定的对象添加到当前集合中。
2.public void clear()         :清空集合中的所有元素。
3.public boolean remove(E e)  :把给定的对象在当前集合中删除。
4.public boolean contains(E e):判断当前集合中是否包含给定对象。
5.public boolean isEmpty()    :判断当前集合是否为空。
6.public int size()           :返回集合中元素的个数。
7.public Object[] toArray()   :把集合中的元素，存储到数组中。
 */
public class Demo01Collection {

    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();//使用多态的方法创建集合对象

        coll.add("王王");
        coll.add("希王");
        coll.add("王希");
        System.out.println(coll);//默认重写toString方法

        Object arr[] = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        coll.remove("王王");
        System.out.println(coll);

        coll.clear();
        System.out.println(coll);

        boolean a = coll.contains("王希");
        System.out.println(a);

        boolean b = coll.isEmpty();
        System.out.println(b);

        int c = coll.size();
        System.out.println(c);



    }

}
