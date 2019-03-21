package cn.gdlgxy.WXDemo3API;
/*
【重点】字符串的内容用不可变。
因此字符串是可以共享使用的，在效果上相当于char[]字符数组
但是底层原理是byte[]字节数组

创建String类对象的3+1种方法：
三种构造方法：
1.public String()：创建一个空白的字符串，不含有任何内容
2.public String(char[] array)：根据字符数组的内容，来创建对应的字符串
3.public String(byte[] array)：根据字节数组的内容，来创建对应的字符串
一种直接创建：
String str = "Hello";//右边直接双引号

字符串常量池：程序当中直接写上的双引号字符串，就在字符串常量池中。

对于基本类型来说，==是进行数值的比较。
对于引用类型来说，==是进行【地址值】的比较。
 */


public class Demo05String {

    public static void string1(){//空参构造
        String str1 = new String();
        System.out.println("第1个字符串："+str1);
    }

    public static void string2(){//根据字符数组创建字符串
        char[] charArray = {'A','B','C'};
        String str2 = new String(charArray);
        System.out.println("第2个字符串："+str2);
    }

    public static void string3(){//根据字节数组创建字符串
        byte[] byteArray = {97,98,99};
        String str3 = new String(byteArray);
        System.out.println("第3个字符串："+str3);
    }

    public static void main(String[] args) {
        string1();
        string2();
        string3();
    }



}
/*
"=="是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法：

方法一：public boolean equals(Object obj):
参数可以是任何对象，只有参数是一个字符串并且内容相同才会给true;否则返回false。
注意事项：
1.任何对象都能用Object进行接收
2.equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样
3.如果比较双方一个常量一个变量，推荐把常量字符串写在前面。
推荐 "abc".equals(str)    不推荐 str.equals("abc")

方法二：public boolean equalsIsIgnoreCase():不区分大小写的内容比较，方法同上。
*/


/*
String 中与获取相关的常用方法：

1.public int length();获取字符串当中含有的字符个数，拿到字符串长度。
2.public String concat (String str);将当前字符串和参数字符串拼接成一个新的返回值字符串。
3.public char charAt(int index);获取指定索引位置的单个字符，索引从0开始。
4.public int indexOf(String str);查找参数字符串在本字符串当中手持出现的索引位置，如果没有返回-1值。
 */


/*
字符串的截取方法：

1.public String substring(int index);截取从参数位置一直到字符串末尾，返回新字符串
2.public String substring(int begin,int end);截取从begin开始，一直到end借书，中间的字符串
备注[begin,end),包含左边，不包含右边。
 */

/*
String当中与转换相关的常用方法：

1.public char[] toCharArray();将当前字符串拆分成为字符数组作为返回值。
2.public char[] getBytes();获得当前字符串底层的字节数组。
3.public String replace(CharSequence oldString,CharSequence newString);
将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串。
 */

/*
分割字符串的方法：

public String[] split(String regex);
按照参数的规格，将字符串企鹅分为若干部分。
注意事项：split方法的参数是一个"正则表达式"，如果按照英文句点"."切分，必须写成"//."(两个反斜杠)
 */