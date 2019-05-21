package com.hit.demo14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*

23.Date类一个综合案例----你来到这个世界多少天
你来到这个世界多少天
分析：
          A:键盘录入你的出生的年月日
          B:把该字符串转换为一个日期
          C:通过该日期得到一个毫秒值
          D:获取当前时间的毫秒值
          E:用D-C得到一个毫秒值
          F:把E的毫秒值转换为年
                                 /1000/60/60/24
* */
public class DateFormatDemo3 {
   /* public static void main(String[] args) throws ParseException {

//        键盘录入你的出生年月日
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生年月日（如2016-10-10）：");
        String s = sc.nextLine();

//        把该字符串转换为一个日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(s);
        System.out.println("d:"+d);

//        通过该日期得到一个毫秒值
        long time = d.getTime();

//        获取当期时间的毫秒值
        long timeNow = System.currentTimeMillis();

//        用D-C得到一个毫秒值
        long sum = timeNow - time;

//        把E的毫秒值转换为年
        long days = sum / 1000 / 60 / 60 / 24;
        System.out.println("你来到这个世界"+days+"天了！");
    }*/
   public static void main(String[] args)  throws ParseException {
       /*Scanner sc = new Scanner(System.in);
       System.out.println("请输入你的出生年月日（如2016-10-10）：");
       String s = sc.nextLine();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       Date d = sdf.parse(s);
//       System.out.println(d);
       long time = d.getTime();
       long timeNow = System.currentTimeMillis();
       long sub = timeNow - time;
       long days = sub / 1000 / 60 / 60 / 60 / 24;*/
//       System.out.println("");
//       int num;
       Scanner sc1 = new Scanner(System.in);
       int num;
       int sum = 0;
       while (true) {
           sum++;
           System.out.print("请输入一个数字（1代表爸爸，2代表妈妈，3代表弟弟，4代表我）：");

           num = sc1.nextInt();

           switch (num) {
               case 1:
                   System.out.print("这是爸爸来到这个世界的天数：");
                   DaysToWorld();
                   break;
               case 2:
                   System.out.print("这是妈妈来到这个世界的天数：");
                   DaysToWorld();
                   break;
               case 3:
                   System.out.println("这是弟弟来到这个世界的天数：");
                   DaysToWorld();
                   break;
               case 4:
                   System.out.println("这是我来到这个世界的天数：");
                   DaysToWorld();
                   break;
                   default:
                       break;
           }
           if (sum == 4) {
               break;
           }
       }

   }

    public static void DaysToWorld() {
        try {
            System.out.println("请输入你的出生年月日（如2016-10-10）：");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(s);
//       System.out.println(d);
            long time = d.getTime();
            long timeNow = System.currentTimeMillis();
            long sub = timeNow - time;
            long days = sub / 1000 / 60 / 60 / 24;
            System.out.println("你来到这个世界"+days+"天了！");
        } catch (ParseException e) {
        }
    }
}
