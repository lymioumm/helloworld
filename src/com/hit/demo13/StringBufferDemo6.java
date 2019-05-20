package com.hit.demo13;

public class StringBufferDemo6 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        System.out.println(s1 + "---" + s2);
        change(s1, s2);
        System.out.println(s1 + "---" + s2);

        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("world");
        System.out.println(sb1 + "---" + sb2);
        change(sb1, sb2);
        System.out.println(sb1 + "---" + sb2);
    }

    public static void change(String s1, String s2) {
        s1 = s2;
        s2 = s1 + s2;
    }

    public static void change(StringBuffer sb1, StringBuffer sb2) {
        sb1 = sb2;
        sb2.append(sb1);
    }
}

/*
程序运行结果
* hello---world
hello---world
hello---world
hello---worldworld
* */
/*
* 字符串是一个特殊的引用类型，只能把它当做基本类型看，字符串例如“hello”看做常量
*
* */