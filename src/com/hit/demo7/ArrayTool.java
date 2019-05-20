package com.hit.demo7;

public class ArrayTool {
//    把构造方法私有，外界就不能在创建对象
    private ArrayTool() {

    }
    public static void printArray(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.println(arr[x]);
            } else {
                System.out.println(arr[x] + ",");
            }
        }
    }
    /*public  void printArray(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.println(arr[x]);
            } else {
                System.out.println(arr[x] + ",");
            }
        }
    }*/
}
