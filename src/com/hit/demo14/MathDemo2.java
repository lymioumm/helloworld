package com.hit.demo14;

import java.util.Random;
import java.util.Scanner;

/*
需求：请设计一个方法，可以实现获取任意范围内的随机数。
 
  分析：
          A:键盘录入两个数据。
              int start;
              int end;
          B:想办法获取在start到end之间的随机数
              我写一个功能实现这个效果，得到一个随机数。(int)
          C:输出这个随机数
* */
public class MathDemo2 {
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始数：");
        int start = sc.nextInt();
        System.out.println("请输入结束数：");
        int end = sc.nextInt();
//        调用功能
        int num = getRandom(start, end);
//        输出结果
        System.out.println(num);

    }
//写一个功能 两个明确：(1)返回值类型：int (2)参数列表：int start,int end
    public static int getRandom(int start, int end) {
//        int number = (int) (Math.random() * 100) + 1;
        int number = (int) (Math.random() * end) + start;
        return number;
    }*/
   /*public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("请输入开始数：");
       int start = sc.nextInt();
       System.out.println("请输入结束数：");
       int end = sc.nextInt();
//       int number = (int) (Math.random() * end) + start;
       int number = (int) (Math.random() * (end - start + 1)) + start;
       System.out.println(number);

   }*/
   public static void main(String[] args) {

       Random r = new Random();
       for (int x = 0; x < 10; x++) {
           int num = r.nextInt(100) + 1;
           System.out.println(num);

       }
   }
}
