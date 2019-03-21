package cn.gdlgxy.WXDemo02Object;

public class Demo05ClassTest {//测试 Demo04这个标准类

    public static void main(String[] args) {

        Demo04StandardClass stu = new Demo04StandardClass();//调用无参构造方法

        stu.setName("王希");

        stu.setAge(18);

        System.out.println("姓名："+stu.getName()+"，年龄："+stu.getAge());

        System.out.println("=====================");

        Demo04StandardClass stu2 = new Demo04StandardClass("靓仔希",21);//调用全参构造方法

        System.out.println("姓名："+stu2.getName()+"，年龄："+stu2.getAge());



    }


}
