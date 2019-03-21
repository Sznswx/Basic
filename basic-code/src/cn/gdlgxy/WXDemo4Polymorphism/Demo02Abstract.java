package cn.gdlgxy.WXDemo4Polymorphism;
/*
抽象方法：就是加上abstract关键字，然后去掉大括号，直接分号结束。
抽象类：抽象方法所在的类，必须是抽象类才行。在class之前写上abstract即可。

如何使用抽象类和抽象方法：
1.不能直接创建new抽象类对象。
2.必须用一个子类继承抽象父类，并覆盖重写里面的抽象方法。@Override
3.创建子类的对象使用。

注意事项：
1.一个抽象类不一定含有抽象方法，只要保证抽象方法所在的类是抽象类即可。
2.抽象类不能直接创建对象。
3.抽象类中可以有构造方法，是供子类创建对象时，初始化父类成员使用的。
4.抽象类的子类，必须重写所有的抽象方法。除非该子类也是抽象类。
 */
import cn.gdlgxy.BasicClass.Abstract;

public class Demo02Abstract extends Abstract {


    @Override
    public void Wx() {
        System.out.println("抽象方法重写执行！");
    }

}
