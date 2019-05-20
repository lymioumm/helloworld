package com.hit.demo14;


//正则表达式：是指一个用来描述或者匹配一系列符合某个句法规则的字符串的单个字符串，
//其实就是一种规则，有自己的应用

//例：校验QQ号
/*
* 要求：
* 1、必须是5-15位数字
* 2、0不能开头
* */

import java.util.Scanner;

//不用正则表达式的做法
public class RegexDemo {
    public static void main(String[] args) {

//键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的QQ号码:");
        String qq = sc.nextLine();
        System.out.println("checkQQ:" + checkQQ(qq));


    }

    /*
     * 写一个功能实现校验
     * 两个明确：
     * 1、明确返回值类型：boolean
     * 2、明确参数列表：String qq
     * */
    public static boolean checkQQ(String qq) {
        boolean flag = true;
//        校验长度
        if (qq.length() >= 5 && qq.length() <= 15) {
            //0不能开头
            if (!qq.startsWith("0")) {
//                必须是数字
                char[] chs = qq.toCharArray();
                for (int x = 0; x < chs.length; x++) {
                    char ch = chs[x];
                    if (!Character.isDigit(ch)) {
                        flag = false;
                        break;
                    }
                }
            } else {
                flag = false;
            }
        } else {
            flag = false;
        }
        return flag;
    }
}
