package com.hit.demo13;

public class IntegerDemo4 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer ii = 100;
        ii += 200;
        System.out.println("i:"+i);
        System.out.println("ii:"+ii);

        Integer iii = Integer.valueOf(100);
        iii = Integer.valueOf(iii.intValue() + 200);
        System.out.println((new StringBuilder("iii:")).append(iii).toString());
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        System.out.println("-----");
        Integer i3 = new Integer(128);
        Integer i4 = new Integer(128);
        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));
        System.out.println("-------");
        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i6 == i5);
        System.out.println(i5.equals(i6));
        Integer i7 = 127;
        Integer i8 = 127;
        System.out.println(i7 == i8);
        System.out.println(i7.equals(i8));


    }
}

/*
* equals方法被重写过，所以比较的是内容，均为true
* Integer 的数据直接赋值，如果在-128到127之间，会直接从缓冲池里获取数据（不会再通过new创建）
* */