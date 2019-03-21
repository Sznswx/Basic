package cn.gdlgxy.WXDemo02Object;

public class Demo02StudentClass {//创建一个学生类

    static String name;

    static int age;

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    public void study(){
        System.out.println("学习");
    }


    public static void main(String[] args) {

        System.out.println(name);

        System.out.println(age);
    }

}
