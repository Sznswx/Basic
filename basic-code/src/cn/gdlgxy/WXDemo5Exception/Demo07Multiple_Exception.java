package cn.gdlgxy.WXDemo5Exception;

import java.util.List;

/*
多异常捕获的三种处理方式：
1.多个异常分别处理。
2.多个异常一次捕获，多次处理。
  2.1 catch里面定义的异常变量，如果有子父类关系，那么子类的异常变量必须写在上边，否则就会报错。
3.多个异常一次捕获，一次处理。
4.运行时异常被抛出时可以不处理。既不捕获也不声明抛出。
  默认给虚拟机处理，终止程序，什么时候不抛出异常了，再来执行程序。
 */

/*
子父类异常：
1.如果父类抛出了多个异常，子类重写父类方法时，抛出和父类相同的异常或者是父类异常的子类或不抛出异常。
2.父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常。此时子类产生异常，只能捕获处理，补鞥呢声明抛出。
注意：父类异常什么样，子类异常就什么样。
 */
public class Demo07Multiple_Exception {

}
