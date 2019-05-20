package com.hit.demo8;

/*
* 这是针对数组进行操作的工具类
* @author 李苗苗
* @version V.01
* */
/*author
 */
/*/**
*@author 李苗苗
*@Have a nice day!
*@date 2019/5/13 0013 11:03
*param 
*@return 
*
*/

/**
*@author 李苗苗
*@Have a nice day!
*@date 2019/5/13 0013 11:04
*param 
*@return 
*
*/

/**
*@have a nice day!
*@date 2019/5/13 0013 11:08
*@author lymiou
*/
/**
*@author lymiou
*@date 2019/5/13 0013 13:52
@这是一个练习制作文档注释的例子
@have fun！
*/
public class ArrayTool {

    //    把构造方法私有，外界就不能再创建对象了
    /*
    * 这是私有构造
    * */
    private ArrayTool() {}
    /*
    * 这是遍历数组的方法，遍历后的格式是：[元素1，元素2，元素3，...]
    * @param arr 这是要被遍历的数组
    * */

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.print(arr[x]+"]");
            } else {
                System.out.print(arr[x] + ", ");
            }
        }
    }
/*
* 这是获取数组中最大值的方法
* @param arr 这是要获取最大值的数组
* @return 返回数组中的最大值
* */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }

    /*
     * 获取指定元素在数组中第一次出现的索引，如果元素不存在，就返回-1
     * @param arr 被查找的数组
     * @param value 要查找的元素
     * @return 返回元素在数组的索引，如果不存在，返回-1
     * */
    public static int getIndex(int[] arr, int value) {
        int index = -1;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == value) {
                index = x;
                break;
            }
        }
        return index;
    }

}
