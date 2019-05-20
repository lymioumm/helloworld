package com.hit.demo12;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println("isEmpty:" + s1.isEmpty());
        String s4 = "";
        System.out.println("isEmpty:" + s4.isEmpty());
        String s5 = null;
        System.out.println("isEmpty:" + s5.isEmpty());
        String s2 = "World";
        String s3 = "HelloWorld";
        System.out.println(s3 == s1 + s2);
        System.out.println(s3.equals(s1 + s2));

        System.out.println(s3 == "Hello" + "World");
        System.out.println(s3.equals("Hello" + "World"));
    }
}
/*
* 字符串如果说是变量相加，先开空间，再拼接
* 字符串如果是常量相加，是先加，然后再在常量池找，如果有就是直接返回，否则，就创建
* */