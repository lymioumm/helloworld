package com.hit.demo8;

public class Son5 extends Father5 {
    public Son5() {
        super("随便");
        System.out.println("Son5的无参构造方法");
    }

    public Son5(String name) {
        this();
        System.out.println("Son5的带参构造方法");
    }
}
