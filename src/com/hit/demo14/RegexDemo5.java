package com.hit.demo14;

import java.util.Arrays;

public class RegexDemo5 {
    public static void main(String[] args) {

/*//        定义一个字符串
        String s1 = "aa,bb,cc";

//        直接分割  split(regex)
        String[] str1Array = s1.split(",");
        for (int x = 0; x < str1Array.length; x++) {
            System.out.println(str1Array[x]);
        }

        String s2 = "aa.bb.cc";
        String[] str2Array = s2.split("\\.");
        for (int x = 0; x < str2Array.length; x++) {
            System.out.println(str2Array[x]);
        }

        String s3 = "aa bb    cc";
        String[] str3Array = s3.split(" +");
        for (int x = 0; x < str3Array.length; x++) {
            System.out.println(str3Array[x]);

        }
*/
        String s4 = "E:\\JavaSE\\day14\\avi";
        String[] str4Array = s4.split("\\\\");
        for (int x = 0; x < str4Array.length; x++) {
            System.out.println(str4Array[x]);
        }


        String s = "91 27 38 46 50";
        String[] strArray = s.split(" ");
        int[] arr = new int[strArray.length];
        for (int x = 0; x < strArray.length; x++) {
            arr[x] = Integer.parseInt(strArray[x]);
        }
        Arrays.sort(arr);
        StringBuffer ss = new StringBuffer();
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
            ss.append(arr[x]).append(" ");
        }
        System.out.println(ss.toString().trim()+"---");

    }
}
