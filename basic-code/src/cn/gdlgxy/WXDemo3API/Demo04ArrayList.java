package cn.gdlgxy.WXDemo3API;
/*
数组的长度不可以改变，但是ArrayList(集合)是可以随意变化的。
对于ArrayList来说，有一个尖括号<E>代表泛型。
泛型：装在集合中的元素，全都是统一的类型
注意：泛型只能是引用类型，不能是基本类型
延伸：对于ArrayList来说，直接打印得到的不是地址值，而是内容。
如果内容为空，得到的是空的中括号
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Demo04ArrayList {

    public static void List1(){//集合的创建与基本使用方法

        ArrayList<String> list = new ArrayList<>();

        list.add("古力娜扎");
        list.add("迪丽热巴");
        list.add("马尔扎哈");

        System.out.println(list);

    }

/*
ArrayList中的常用方法：
1.public boolean add(E e);向集合中添加元素，参数的类型与泛型一致
提醒：对于ArrayList集合来说，add添加动作是一定成功的，所以返回值类型可用可不用
     但是对于其他集合，add的添加动作不一定成功，返回值代表添加有没有成功

2.public E get(int index);从集合中获取元素，参数是索引编号，返回值是对应位置的元素
3.public E remove(int index);从集合中删除元素，参数是索引编号，返回值是被删除掉的元素。
4.public int size();获取集合的尺寸长度，返回值是集合中包含的元素个数
 */

    public static void List2(){//判断添加动作是否成功的方法

        ArrayList<String> list = new ArrayList<>();//创建一个新的集合 list

        boolean success = list.add("迪丽热巴");//创建一个布尔型变量用于接收 .add方法的返回值

        System.out.println(list + ",添加动作是否成功:" + success);

    }

    public static void List3(){//从集合中获取元素，get(int index) 获取索引值所对应的元素

        ArrayList<String> list = new ArrayList<>();//创建一个新的集合 list

        Scanner name = new Scanner(System.in);

        for (int i = 0; i <= 3; i++) {//使用循环语句连续向集合中添加五个元素

            String name1 = name.next();

            list.add(name1);

        }

        String name2 = list.get(3);//创建一个 String变量用于接收 list.get的返回值（索引所代表的元素）

        System.out.println(list);//输出当前集合的内容

        System.out.println("===================");

        System.out.println("索引值为3的名字为："+ name2);

    }

    public static void List4(){
        ArrayList<String> list = new ArrayList();

        Scanner name = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            String name1 = name.next();

            list.add(name1);

        }

        String whoname = list.remove(2);//删除索引值为2的集合元素

        System.out.println(whoname);

    }

    public static void List5(){

        ArrayList<String> list = new ArrayList<>();

        list.add("wx");
        list.add("xx");
        list.add("ww");

        int lenth = list.size();

        System.out.println(lenth);//输出集合的长度

        System.out.println("===========");

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));//遍历并输出集合的元素

        }

    }

/*
前情提要：
ArrayList <E>集合只能存储引用类型，而不能存储基本类型

若想使用集合存储基本类型数据，必须使用基本类型对应的包装类

基本类型   包装类
byte       Byte
short      Short
int        Integer   【特殊】
long       Long
float      Float
double     Double
char       Character 【特殊】
boolean    Boolean
*/

    public static void List6() {

        ArrayList<Integer> listint = new ArrayList<>();

        listint.add(100);
        listint.add(200);
        listint.add(300);

        System.out.println(listint);

        int num = listint.get(2);

        System.out.println(num);

    }

    public static void main(String[] args) {

       //List1();
       //List2();
       //List3();
       //List4();
       //List5();
       List6();

    }

}
