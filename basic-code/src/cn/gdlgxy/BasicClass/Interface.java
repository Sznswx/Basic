package cn.gdlgxy.BasicClass;
/*
在任何Java版本中，接口都能定义抽象方法。
格式:
public abstract 返回值类型 方法名称（参数列表）;

注意事项：
1.接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract
2.这两个关键字修饰符，可以选择性的省略。
 */
public interface Interface {//这是一个接口

    /*
    接口的默认方法，可解决接口胜机的问题。
    1.调用默认方法时，如果实现类中没有，会向上找接口。
    2.接口的默认方法，也可以被接口的实现类进行覆盖重写。
     */
    public default void interface1() {//默认方法
        System.out.println("这是一个默认方法！");
    }

    public abstract void interface2();//抽象方法

    /*
    静态方法的格式：
    public static 返回值类型 方法名称（参数列表）{
         方法体
    }

    【注意】不能通过接口实现类的对象来调用接口中的静态方法。
    正确的做法是：通过接口名称，直接调用其中的静态方法。
    格式：  接口名称.静态方法名（参数）

     */

    public static void interface3(){
        System.out.println("这是一个静态方法！");
    }

    /*
    私有方法：抽取一个共有的方法，来解决两个默认方法之间重复代码的问题。
    但是这个共有方法不应该让实现类实现，应该是私有化的。Java 9 开始支持。
     private void method(){
        方法体；
    }
     */

    /*
    接口当中也可以定义"成员变量"，但是必须使用public static final三个关键字进行修饰。
    从效果上看，这其实就是接口的【常量】。
    格式：
    public static final 数据类型 常量名称 = 数据值；
    备注：
    有点使用final关键字进行修饰，说明不可改变。

    注意事项：
    1.接口当中的常量，可以省略public static final，不写也是这样。
    2.接口当中的常量，必须进行赋值。
    3.接口中常量的名称，使用完全大写的字母，用下划线分隔单词。
     */
    public static final int NUM_OF_MY_AGE = 21;





}
