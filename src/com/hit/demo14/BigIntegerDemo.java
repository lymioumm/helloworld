package com.hit.demo14;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("100");
        BigInteger bi2 = new BigInteger("50");
        BigInteger[] bis = bi1.divideAndRemainder(bi2);
        System.out.println("商："+bis[0]);
        System.out.println("余数："+bis[1]);
        BigInteger ab = bi1.add(bi2);
        System.out.println(ab);
        BigInteger sb = bi1.subtract(bi2);
        System.out.println(sb);
        BigInteger mb = bi1.multiply(bi2);
        System.out.println(mb);
    }

}
