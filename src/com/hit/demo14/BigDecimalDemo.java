package com.hit.demo14;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        System.out.println(0.09+0.01);
        System.out.println(1.0-0.32);
        System.out.println(1.015*100);
        System.out.println(1.301/100);
        System.out.println(1.0-0.12);

        BigDecimal bd1 = new BigDecimal("1.0");
        BigDecimal bd2 = new BigDecimal("0.32");
        System.out.println("subtract:"+bd1.subtract(bd2));

        System.out.println("------乘-----");
        BigDecimal bd3 = new BigDecimal("1.015");
        BigDecimal bd4 = new BigDecimal("100");
        System.out.println("multiply:" + bd3.multiply(bd4));

        System.out.println("----除----");
        BigDecimal bd5 = new BigDecimal("1.301");
        BigDecimal bd6 = new BigDecimal("100");
        System.out.println("divide:"+bd5.divide(bd6));
    }
}
