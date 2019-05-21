package com.hit.demo14;


//分割功能举例

import java.util.Arrays;

/*
* 我有如下一个字符串：“91 27 46 38 50”
* 请写代码实现最终输出结果是：“27 38 46 50 91”
* */
public class RegexDemo4 {
    /*public static void main(String[] args) {
//        定义一个字符串
        String s = "91 27 46 38 50";

//        把字符串进行分割，得到一个字符串数组
        String[] strArray = s.split(" ");

//        把字符串数组变换成int数组
        int[] arr = new int[strArray.length];
        for (int x = 0; x < arr.length; x++) {
            arr[x] = Integer.parseInt(strArray[x]);
        }
//        对int数组排序
        Arrays.sort(arr);

//        把排序后的int数组装成一个字符串（不能直接调用toString方法，因为数字之间由空格隔开而不是逗号）
        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < arr.length; x++) {
            sb.append(arr[x]).append(" ");
        }
//        转换为字符串
        String result = sb.toString().trim();
        //这里的toString方法是StringBuilder转换成String类型的过程
//        trim() 方法旨在去掉字符串最后一个空格
//        输出字符串
        System.out.println("result:" + result);
    }*/


    /*public static void main(String[] args) {
        String s = "91 27 46 38 50";
        String[] strArray = s.split(" ");
//        char[] chs = s.toCharArray();
//        int[] arr = Integer.parseInt(strArray);
//        char[] chs = new char[];
        int[] arr = new int[strArray.length];
        for (int x = 0; x < arr.length; x++) {
            arr[x] = Integer.parseInt(strArray[x]);
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < arr.length; x++) {
            sb.append(arr[x]).append(" ");

        }
        String result = sb.toString().trim();
        System.out.println(result);

    }*/
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        String[] strArray = s.split(" ");
        int[] arr = new int[strArray.length];
        for (int x = 0; x < arr.length; x++) {
            arr[x] = Integer.parseInt(strArray[x]);//把字符串数组中的91，27，46，38，50等转换成十进制的91，27，46，38，50等
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < arr.length; x++) {
            sb.append(arr[x]).append(" ");
        }
        String result = sb.toString().trim();
        System.out.println("reslut:" + result);
    }
}
