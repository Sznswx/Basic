package cn.gdlgxy.WXDemo01Basics;

public class Demo05ArrayOverthrow {//颠倒数组方法

    public static void main(String[] args) {

        int[] num={0,1,2,3,4,5};

        System.out.println(num);//输出数组的内存地址哈希值

        System.out.println("========================");


        int len= num.length;

        System.out.println(len);//输出数组的长度

        System.out.println("========================");

        for (int i = 0; i < len; i++) {//遍历输出数组

            System.out.println(i);
        }

        System.out.println("========================");

        DD();
    }

    public static void DD () {//颠倒数组的方法

        int [] ZXSZ = {0,1,2,3,4,5}; //创建一个新数组

        int len2 = ZXSZ.length;//获取数组长度

        for (int min=0 , max = len2-1; min < max ; min++ , max-- ) {//颠倒数组的 for 循环

            int temp = ZXSZ[min];

            ZXSZ[min] = ZXSZ[max];

            ZXSZ[max] = temp;
        }

        /*

        初始化变量：int min=0 , max = len2-1;

        判断条件：min < max ;

        循环体：int temp = ZXSZ[min];
               ZXSZ[min] = ZXSZ[max];
               ZXSZ[max] = temp;

        步进：min++ , max--

         */

        for (int i = 0; i < len2; i++) {//遍历输出一遍颠倒后的数组

            System.out.println(ZXSZ[i]);
        }
    }
}
