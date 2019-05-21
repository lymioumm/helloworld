package com.hit.demo14;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("d:"+d);

        Date dd = new Date(System.currentTimeMillis());
        System.out.println("dd:"+dd);

        long time = 1000 * 60 * 60;
        Date d2 = new Date(time);
        System.out.println("d2:"+d2);

        /*
        * Date类的一些方法
        * public long getTime():获取时间，以毫秒为单位
        * public void setTime(long time):设置时间
        * */
//        创建对象
        Date dn = new Date();
//        获取时间
        long times = dn.getTime();
        System.out.println(times);
        System.out.println(System.currentTimeMillis());

        System.out.println("dn:"+dn);

//        dn.setTime(1000);//1000代表1000毫秒
        dn.setTime(System.currentTimeMillis());
        System.out.println("dn:"+dn);
    }
}
