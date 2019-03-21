package cn.gdlgxy.WXDemo3API;

import java.util.Arrays;

/*
java.util.Arrays是一个与数组相关的工具类，里面提供了大量的静态方法，用来实现数组的常见操作。

public static String toString(数组);将参数数组变成字符串，按照默认各式：[元素1,元素2,元素3...]

public static void sort(数组);按照默认升序(从小到大)对数组的元素进行排序。

 */
public class Demo06Arrays {

    public static void main(String[] args) {

        int[] intArray = {10,20,30};

        String intStr = Arrays.toString(intArray);

        System.out.println(intStr);

        System.out.println("=====================");

        String[] StrArray = {"aaa","ccc","bbb"};

        Arrays.sort(StrArray);

        System.out.println(Arrays.toString(StrArray));


    }



}
