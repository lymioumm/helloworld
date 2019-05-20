package com.hit.demo13;

import java.util.Arrays;

public class ArrayDemo3 {
    public static void main(String[] args) {

//        定义一个数组
        int[] arr = {24, 69, 80, 57, 13};

//        public static String toString(int[] a)把数组转换成字符串
        System.out.println("排序前：" + Arrays.toString(arr));

//        public static void sort(int[] a)对数组进行排序
        Arrays.sort(arr);
        System.out.println("排序后："+Arrays.toString(arr));
//        [13,24,57,69,80]
//        public static int binarySearch(int[],arr,int key) 二分查找
        System.out.println("binrySearch:" + Arrays.binarySearch(arr, 57));
        System.out.println("binrySearch:" + Arrays.binarySearch(arr, 5));

    }
}
