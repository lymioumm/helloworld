package com.hit.demo13;

public class IntegerTurn {
    public static void main(String[] args) {
        System.out.println(Integer.toOctalString(100));
        System.out.println(Integer.toHexString(100));
        System.out.println(Integer.toBinaryString(100));
        System.out.println("-------");
        System.out.println(Integer.toString(100,10));
        System.out.println(Integer.toString(100,2));
        System.out.println(Integer.toString(100,8));
        System.out.println(Integer.toString(100,16));
        System.out.println(Integer.toString(100,5));
        System.out.println(Integer.toString(100,7));
        System.out.println(Integer.toString(100,-7));
        System.out.println(Integer.toString(100,70));
        System.out.println(Integer.toString(100,1));
        System.out.println(Integer.toString(100,17));
        System.out.println(Integer.toString(100,32));
        System.out.println(Integer.toString(100,37));
        System.out.println(Integer.toString(100,36));
        System.out.println("----其他进制到十进制----");
        System.out.println(Integer.parseInt("100",10));
        System.out.println(Integer.parseInt("100",8));
        System.out.println(Integer.parseInt("100",2));
        System.out.println(Integer.parseInt("100",16));
        Integer x = new Integer(4);
        System.out.println(x);
        Integer y = null;
        System.out.println(y);
    }
}
