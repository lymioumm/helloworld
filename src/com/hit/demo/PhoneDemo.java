package com.hit.demo;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "小米";
        p.price = 1999;
        p.color = "红色";
        sop(p.brand + "---" + p.price + "----" + p.color);
        p.call("风清扬");
        p.sendMessage();
        p.playGame();
        Phone p2 = new Phone();
        p2.brand = "华为";
        p2.price = 1699;
        p2.color = "黑色";
        sop(p2.brand+"----"+p2.price+"----"+p2.color);
        p2.call("令狐冲");
        p2.sendMessage();
        p2.playGame();
    }

    private static void sop(String s) {
    }
}
