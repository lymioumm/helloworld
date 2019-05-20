package com.hit.demo12;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {


//        字符串反转


//        方法1：
        System.out.println("请输入一个字符：");
        //        键盘录入一个字符
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
//        定义一个新字符串
        String result = "";
//        把字符串转换成字符数组
        char[] chs = line.toCharArray();
//        倒着遍历字符串，得到每一个字符
        for (int x = chs.length - 1; x >= 0; x--) {
//            用新字符串把每一个字符拼接起来
            result += chs[x];
//            输出新串
        }
        System.out.println("反转后的结果是：" + result);



//        方法2：
        System.out.println("Please enter a string:");
        Scanner sc2 = new Scanner(System.in);
        String s2 = sc2.nextLine();
        System.out.println("----------");
        String s3 = sc2.nextLine();
        System.out.println(s3);

        char[] ch2 = s2.toCharArray();
        char temp;
        for (int x = 0; x < (ch2.length) / 2; x++) {
            temp = ch2[x];
            ch2[x] = ch2[ch2.length - 1 - x];
            ch2[ch2.length - 1 - x] = temp;
        }
        String s22 = String.valueOf(ch2);
        System.out.println(s22);

//        去除字符串两空格（只可以去除字符串的前后空格而不能去除中间空格）
        String s = " hello world ";
        String ss = s.trim();
        System.out.println("s:" + s + "---");
        System.out.println("ss:" + ss + "---");



    }
}
