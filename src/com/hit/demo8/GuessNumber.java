package com.hit.demo8;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
//        程序产生一个随机数
        int number = (int) (Math.random() * 100) + 1;
        int flag=0;
//        给出多次猜测机会，猜中就结束
        while (true) {
//            键盘录入数据
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数据（1-100）");
            int guessNumber=sc.nextInt();
            if (guessNumber > number) {
                System.out.println("你要猜的数据" + guessNumber + "大了");
            } else if (guessNumber < number) {
                System.out.println("你要猜的数据" + guessNumber + "小了");

            } else {
                flag=1;
                System.out.println("恭喜你，猜中了");
            }
            if (flag == 1) {
                break;
            }
        }
    }
}
