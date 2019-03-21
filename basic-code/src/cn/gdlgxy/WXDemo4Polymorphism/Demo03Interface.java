package cn.gdlgxy.WXDemo4Polymorphism;

import cn.gdlgxy.BasicClass.Interface;
/*
接口就是多个类的公共规范。
接口是一种引用数据类型，最重要的内容就是其中的【抽象方法】。

接口的定义各式：
public interface 接口名称{
    //接口内容
}

备注：换成关键字interface之后，编译生成的字节码文件仍然是：.java --> .class

在java 8中，接口中可以包含的内容有：
1.常量
2.抽象方法
3.默认方法
4.静态方法

在java 9中，还可包含【私有方法】
 */
public class Demo03Interface implements Interface { //实现类

/*
1.接口不能直接用，必须有一个【实现类】来实现该接口。
格式： public class 实现类名称  implement  接口名称(){}

2.接口的实现类必须覆盖重写（实现）接口中所有的抽象方法。
3.创建实现类的对象，进行使用。

注意事项：
如果实现类并没有覆盖重写所有的抽象方法，那么这个实现类自己就必须是抽象类。
 */

    @Override
    public void interface1() {

    }

    @Override
    public void interface2() {

    }

    public static void main(String[] args) {
        System.out.println(Interface.NUM_OF_MY_AGE);
    }

}
/*
使用接口时，需要注意：
1.接口是没有静态代码块或是构造方法的。
2.一个类的直接父类是唯一的，但是一个类可以同时实现多个接口。
格式：public class 实现类名称 implements 接口1,接口2 {}
3.如果实现类所实现的多个接口当中，存在重复的抽象方法，那么只需要覆盖重写一次即可。
4.如果实现类所实现的多个接口当中，存在重复的默认方法，那么实现类一定要对冲突的默认方法进行覆盖重写。
5.一个类如果直接父类当中的方法，和接口当中的默认方法产生了冲突，优先使用父类当中的方法。
（在Java中，继承的优先级要高于接口实现）
6.类与类之间时单继承的，直接父类只有一个。
7.类与接口之间是多实现的，一个类可以实现多个接口。
8.接口与接口之间是多继承的。

备注：
1.多个父接口当中的抽象方法如果重复，没关系。
2.多个父接口当中的默认方法如果重复，那么子接口必须进行默认方法的覆盖重写，【而且带着default关键字】
 */