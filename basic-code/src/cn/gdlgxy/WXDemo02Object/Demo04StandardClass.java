package cn.gdlgxy.WXDemo02Object;

public class Demo04StandardClass {//标准类的构成

    private String name;  //成员变量

    private int age;

    public Demo04StandardClass() {   //无参构造方法

    }

    public Demo04StandardClass(String name, int age) {  //全参构造方法

        this.name = name;

        this.age = age;

    }

    public String getName() {  //getter & setter语句

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public int getAge() {

        return age;

    }

    public void setAge(int age) {

        this.age = age;

    }

}
