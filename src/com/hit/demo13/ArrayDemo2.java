package com.hit.demo13;

public class ArrayDemo2 {

    public static void main(String[] args) {
        //    定义一个数组
        int[] arr = {11, 22, 33, 44, 55, 66, 77};

        //    写功能实现
        int index = getIndex(arr, 33);
        System.out.println("index:" + index);
    }

    public static int getIndex(int[] arr, int value) {

//        定义最大索引值及最小索引值
        int max = arr.length - 1;
        int min = 0;

//        计算出中间索引
        int mid = (max + min) / 2;

//        拿中间索引的值和要查找的值进行比较
        while (arr[mid] != value) {
            if (arr[mid] > value) {
                max = mid - 1;
            } else if (arr[mid] < value) {
                min = mid + 1;
            }
//            加入判断
            if (min > max) {
                return -1;
            }
            mid = (max + min) / 2;
        }
        return mid;
    }

}
