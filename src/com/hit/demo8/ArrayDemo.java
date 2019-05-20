package com.hit.demo8;

public class ArrayDemo {
    public static void main(String[] args) {
//        定义数组
        int[] arr = {28, 55, 37, 46, 19,15,34,15,54};
//        需求：遍历数组
        System.out.println(ArrayTool.getIndex(arr, 15));
        System.out.println(ArrayTool.getMax(arr));
        ArrayTool.printArray(arr);
    }
}
