package com.hit.demo13;

//Integer的构造方法
public class IntegerDemo2 {

    public static void main(String[] args) {

//        方式1
        int i = 100;
        Integer ii = new Integer(i);
        System.out.println("ii:" + ii);//输出的不是地址，证明已重写toString方法

//        方式2
//        String s = "abc";//报错
        String s = "100";
        Integer iii = new Integer(s);
        System.out.println("iii:" + iii);
    }
}
