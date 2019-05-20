package com.hit.demo12;

import java.util.Scanner;

public class acquireIntString {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        String s2 = sc2.nextLine();
        System.out.println("a:" + a + ",s2:" + s2);*/


       /*String s = "Hello";
        s += " World";*/

        //String s = new String("Hello");

        String s1 = new String("Hello");
        String s2 = "Hello";

        System.out.println("s1:" + s1);
        System.out.println("s2:" + s2);
        System.out.println(s1 == s2);//"=="比较的是地址值是否相同
        System.out.println(s1.equals(s2));//"equals"比较的是内容是否相同

    }
}
