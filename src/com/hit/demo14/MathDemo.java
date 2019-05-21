package com.hit.demo14;

public class MathDemo {
    public static void main(String[] args) {
        //    public static int max(int a,int b):最大值
        System.out.println("max:" + Math.max(12, 23));
        System.out.println("min:" + Math.min(12, 23));
        System.out.println("ceil:" + Math.ceil(12.32));
        System.out.println("floor:" + Math.floor(12.23));
//方法的嵌套调用
//        获取三个数中的最大值
        System.out.println("max:" + Math.max(Math.max(12, 23), 45));
//        随机数举例
//        获取一个1-100之间的数
//注意这里的优先级，
        System.out.println("random:" + ((int) (Math.random() * 100) + 1));
        System.out.println("round:" + Math.round(12.34f));



    }
}
