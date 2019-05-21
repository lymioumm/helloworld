package com.hit.demo14;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RegexDemo6 {
/*
    public static void main(String[] args) {

//        定义一个字符串
        String s = "helloqq12345worldkh622112345678java";

//        去除字符串所有的数字，用*给替换掉
        String regex = "\\d+";
        String ss = " ";
        String result = s.replaceAll(regex, ss);
        System.out.println(result);
    }
*/
/*public static void main(String[] args) {

    String s = "91 27 46 38 50";
    String[] strArray = s.split(" ");
    int[] arr = new int[strArray.length];
    for (int x = 0; x < arr.length; x++) {
        arr[x] = Integer.parseInt(strArray[x]);
    }
    Arrays.sort(arr);
    StringBuffer ss = new StringBuffer();
    for (int x = 0; x < arr.length; x++) {
        ss.append(arr[x]).append(" ");
    }
    System.out.println("--"+ss.toString().trim()+"---");

}*/
public static void main(String[] args) {
    String s = "helloqq123world6221345java";
    String regex = " ";
    String ss = "\\d+";
    String re = s.replaceAll(ss,regex);
    System.out.println(re);
}
}
