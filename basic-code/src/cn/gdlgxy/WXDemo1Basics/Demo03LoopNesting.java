package cn.gdlgxy.WXDemo1Basics;

public class Demo03LoopNesting { //循环嵌套练习题

    public static void main(String[] args) { //遍历一遍时、分、秒

        for(int hour = 0;hour <=23;hour++){ //第一层循环

            for(int minute = 0;minute <=59;minute++){ //第二层循环

                for(int second = 0;second<=59;second++){ //第三层循环

                    System.out.println(hour+"时"+minute+"分"+second+"秒");
                }
            }
        }
    }
}
