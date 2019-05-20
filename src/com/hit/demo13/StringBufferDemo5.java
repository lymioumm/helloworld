package com.hit.demo13;

import java.util.Scanner;

//判断字符串是否是对称字符

public class StringBufferDemo5 {


    public static void main(String[] args) {
        //    创建键盘录入对象
        System.out.println("---请输入一个字符串----");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();


//        方式1：一个一个的比较
        boolean b = isSame(s);
        System.out.println("b:" + b);

//        方式2：用字符串缓冲区的反转功能
        boolean b2 = isSame2(s);
        System.out.println("b2:" + b2);
    }


    //    方式2：用字符串缓冲区的反转功能
    public static boolean isSame2(String s) {
        return new StringBuffer(s).reverse().toString().equals(s);
//        return new StringBuffer(s).reverse().toString().equals(s);
    }
//    方式1：一个一个的比较
    public static boolean isSame(String s) {

//        把字符串转换成字符数组
        char[] chs = s.toCharArray();
        for (int start = 0, end = chs.length - 1; start <= end; start++, end--) {
            if (chs[start] != chs[end]) {
                return false;
            }
        }
        return true;
    }
}
/*
* String StringBuffer StringBuilder的区别？
* 1、String是内容不可变的，而StringBuffer，StringBuilder都是内容可变的
* 2、StringBuffer是同步的，数据安全，效率低；StringBuilder是不同步的，数据不安全，效率高
*
* StringBuffer和数组的区别？
* 二者都可以看作是一个容器，装其他的数据
* 但是，StringBuffer的数据最终是一个字符串数据
* 而数组可以放置多种数据，但必须是同一种数据类型的
*
* 形式参数问题
* String作为参数传递
* StringBuffer作为参数传递
*
* 形式参数：
* 基本类型：形式参数的改变不影响实际参数
* 引用类型：形式参数的改变直接影响实际参数
*
* 注意：String作为参数传递，效果和基本类型作为参数传递是一样的
* */