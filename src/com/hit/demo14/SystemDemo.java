package com.hit.demo14;

public class SystemDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int x = 0; x < 100; x++) {
            System.out.println("hello" + x);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时："+(end-start)+"毫秒 ");
    }
}
