package com.hit.demo14;

import java.util.Arrays;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        int[] arr2 = {1, 6, 7, 8, 9, 10};
        System.arraycopy(arr,3,arr2,3,2);
        System.arraycopy(arr,3,arr2,2,2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
}
