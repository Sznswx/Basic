package cn.gdlgxy.WXDemo01Basics;

public class Demo02Loop {//循环练习题：求1-100之间偶数的和

    /*

    public static void main(String[] args) { //for循环方法

        int sum = 0;

        for(int i = 1;i<=100;i++){

            if(i%2 == 0){

                sum += i;

            }

        }
        System.out.println(sum);

        }

    }

*/

    /*
    public static void main(String[] args) { //while循环方法

        int sum = 0;

        int i = 1;

        while (i <= 100){

            if(i%2 == 0){

                sum += i;

            }

            i++;

        }

        System.out.println(sum);

    }

    }

*/

    public static void main(String[] args) { //do...while循环方法
        int sum = 0;

        int i = 1;

        do {

            if(i%2 == 0){

                sum += i;

            }

            i++;

        }
        while (i <= 100);

        System.out.println(sum);

        }

                }