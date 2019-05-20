package com.hit.demo8;

import java.sql.SQLOutput;

public class MathDemo {
    public static void main(String[] args) {
/*
//        获取一个随机数
        double d=Math.random();//改值大于等于0.0且小于1.0
        System.out.println(d);
*/
//需求：我要获取一个1-100之间的随机数，how？
        for (int x = 0; x < 100; x++) {
            int number = (int) (Math.random() * 100) + 1;
            System.out.println(number);
        }
    }
}
