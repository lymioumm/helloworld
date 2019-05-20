package com.hit.demo14;

import java.util.Scanner;

//正则表达式判断符合一定规则的字符串
public class RegexDemo2 {
    public static void main(String[] args) {
//        创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的QQ号：");
        String qq = sc.nextLine();
        System.out.println("checkQQ:" + checkQQ(qq));

//        判断手机号码是否满足要求？
//        键盘录入手机号码
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入你的手机号码：");
        String phone = sc1.nextLine();
//        定义手机号码的规则
        String regex = "1[38]\\d{9}";
//        调用功能
        boolean flag = phone.matches(regex);
        System.out.println("flag:" + flag);

//        校验邮箱案例
        Scanner sc2 = new Scanner(System.in);
        String email = sc2.nextLine();
        System.out.println("请输入你的邮箱：");
//        定义邮箱规则
        String regexx = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";
//        调用功能
        boolean flagg = email.matches(regexx);
        System.out.println("flagg:" + flagg);
    }

    public static boolean checkQQ(String qq) {

        String regex = "[1-9][0-9]{4,14}";
//        public boolean matches(String regex)//告知此字符串是否匹配给定的正则表达式
        boolean flag = qq.matches("[1-9][0-9]{4,14}");
        return flag;

//        return qq.matches("[1-9]\\d{4,14}");
    }
}
/*
* 正则表达式的规则
* A:字符
* x字符x eg: 'a'表示字符a（任意的字符表示它本身）
* \\反斜线字符（"\\"表示反斜线）
* \n新行（换行符）
* \r回车符
* B:字符类（把很多字符都放到一起）
* [abc]a、b 或c（简单类）（意为匹配三选一，但不能同时匹配两个，例如ab）
* [^abc]任何字符，除了a、b 或c（否定）
* [a-zA-Z]a到z或A到Z，两头的字母包括在内（范围）（这个写法就意味着包括了所有英文字母）
* [0-9]0到9的字符都包括
* 例如上面：[1-9][0-9]{4-14}
* 代表QQ号码第一个数字在1-9范围之内（即不能为0），第二个数字开始（后面的{4,14}规定了除了第一个数字之外
* ，还包含了4-14之间的任意的数字个数，而这些数字的取值范围就在0-9之间）（总的来说就是QQ号一共是5-15个数字，
* 其中第一个数字不能为0，剩余的4-14个数字可以为0）
* C:预定义字符类（\有转义字符的意思）
* .任何字符
* 但若.就是字符本身，怎么表示？ \.
* \d 数字：[0-9]
* 例如上面的[1-9][0-9]{4,14}可以改写为[1-9]\\d{4,14}
* \w 单词字符：[a-zA-Z_0-9]
* 在正则表达式里面组成单词的东西必须有这些东西组成
* D:边界匹配器
* ^行的开头
* $行的结尾
* \b单词边界
*     就是不是单词字符的地方（单词与单词之间隔开的东西，如下面单词与单词之间的空格，还有？；）
*     举例：hello world？haha;xixi
* E:Greedy数量词
* X? X，一次或一次也没有
* X* X，零次或多次
* X+ X，一次或多次
* X{n} X，恰好n次
* X{n,} X ,至少n次
* X{n,m} X，至少n次，但是不超过m次
* 例如上面：[1-9][0-9]{4,14}代表[0-9]至少出现4次但不超过14次（[1-9]不给出次数，默认为1次）
*
*
* */