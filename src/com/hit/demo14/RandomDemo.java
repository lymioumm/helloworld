package com.hit.demo14;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
//        创建对象
        Random r = new Random();
        for (int x = 0; x < 10; x++) {
            int num = r.nextInt(100) + 1;
            System.out.println(num);
        }
        System.out.println("hello");
//        System.exit(0);//终止运行
        System.out.println("lala");
        System.out.println(System.currentTimeMillis());
    }
}
