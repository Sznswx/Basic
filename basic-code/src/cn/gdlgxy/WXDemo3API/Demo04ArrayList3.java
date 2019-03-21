package cn.gdlgxy.WXDemo3API;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo04ArrayList3 {

    /*
题目三：定义以指定格式打印集合的方法（ArrayList类型作为参数），使用{}扩起集合，使用@分隔每个元素。
格式参照：{元素@元素@元素}。

System.out.println(list);    [10,20,30]

 */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {

            Scanner name = new Scanner(System.in);

            String name1 = name.next();

            list.add(name1);

        }

        System.out.println(list);

        printArrayList(list);

    }

    public static void printArrayList(ArrayList<String> list){

        System.out.print("{");

        for (int i = 0; i < list.size(); i++) {

            if(i == list.size() - 1){

                System.out.print(list.get(i) + "}");

            }else {

                System.out.print(list.get(i) + "@");

            }

        }

    }
}
