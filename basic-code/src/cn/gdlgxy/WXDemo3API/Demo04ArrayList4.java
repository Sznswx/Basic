package cn.gdlgxy.WXDemo3API;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合中。
要求使用自定义的方法实现。

代码思路：
1.创建一个大集合对象，用来存储int数字：<Integer>
2.随机数字久用Random nextInt
3.循环20次，把创建的随机数字放入大集合：for + add
4.定义一个筛选方法


 */
public class Demo04ArrayList4 {

    public static void main(String[] args) {

        ArrayList<Integer> bigList = new ArrayList<>();

        Random r = new Random();

        for (int i = 0; i < 20; i++) {

            int num = r.nextInt(100) + 1;

            bigList.add(num);

        }

        ArrayList<Integer> smallList = getSmallList(bigList);

        for (int i = 0; i < smallList.size(); i++) {

           System.out.println(smallList.get(i));

        }

    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){

        ArrayList<Integer> smallList = new ArrayList<>();

        for (int i = 0; i < bigList.size(); i++) {

            int num = bigList.get(i);

            if (num % 2 ==0){

                smallList.add(num);

            }

        }

        return smallList;

    }

}

