package cn.gdlgxy.WXDemo2Object;

public class Demo03CreateObject {//调用Demo02创建的学生类

    public static void main(String[] args) {

        Demo02StudentClass stu = new Demo02StudentClass();//创建对象

        System.out.println(stu.name);//打印 name与 age变量，系统自动初始化为 Null和 0

        System.out.println(stu.age);

        System.out.println("=======================");

        stu.age = 21;//赋值

        stu.name = "王希";//赋值

        System.out.println(stu.age);

        System.out.println(stu.name);

    }
}
