package com.hit.demo14;

import java.util.Calendar;
import java.util.Date;

public class CalenderDemo {
   /* public static void main(String[] args) {
//        其日历字段已由当前日期和时间初始化
        Calendar rightNow = Calendar.getInstance();//子类对象

//        获取年
        int year = rightNow.get(Calendar.YEAR);
//        获取月
        int month = rightNow.get(Calendar.MONTH);
//        获取日
        int date = rightNow.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");//month从0开始，要加1
        Date d = new Date();
        System.out.println(d);
           }
           */
   public static void main(String[] args) {

//       获取当前的日历时间
       Calendar c = Calendar.getInstance();

//       获取年
       int year = c.get(Calendar.YEAR);
//       获取月
       int month = c.get(Calendar.MONTH);
//       获取日
       int date = c.get(Calendar.DATE);
       System.out.println(year+"年"+(month+1)+"月"+date+"日");

//       三年内前的今天
       c.add(Calendar.YEAR, -3);
//       获取年
       year = c.get(Calendar.YEAR);
//       获取月
       month = c.get(Calendar.MONTH);
//       获取日
       date = c.get(Calendar.DATE);
       System.out.println(year + "年" + (month + 1) + "月" + date + "日");


//       五年后的今天
       c.add(Calendar.YEAR, 5);
       c.add(Calendar.DATE, -22);
       year = c.get(Calendar.YEAR);
       month = c.get(Calendar.MONTH);
       date = c.get(Calendar.DATE);
       System.out.println(year + "年" + (month + 1) + "月" + date + "日");


       System.out.println("-------about set----");

       c.set(2011, 11, 11);
//       获取年
       year = c.get(Calendar.YEAR);
       month = c.get(Calendar.MONTH);
       date = c.get(Calendar.DATE);
       System.out.println(year + "年" + (month + 1) + "月" + date + "日");

   }

}
