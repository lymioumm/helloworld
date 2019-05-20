package com.hit.demo13;

public class ArrayDemo {
    public static void main(String[] args) {

//        定义一个数组
        int[] arr = {24, 69, 80, 57, 13};
        System.out.println("排序前：");
        printArray(arr);
        System.out.println("排序后：");
//       冒泡排序
        bubbleSort(arr);
//        选择排序
//        selectSort(arr);
        printArray(arr);
    }

    //    冒泡排序
    public static void bubbleSort(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = 0; y < arr.length - 1 - x; y++) {
                if (arr[y] > arr[y + 1]) {
                    int temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                }
            }
        }
    }

//    选择排序实现
    public static void selectSort(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[y] < arr[x]) {
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
    }

//    遍历输出功能
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x]+",");
            }
        }
        System.out.println("]");
    }
}
