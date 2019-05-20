package com.hit.demo10;

public class Outer4 {
    public int num = 10;

    class Inner4 {
        public int num = 20;
        public void show() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
//            System.out.println(Outer4.this.num);
            System.out.println(new Outer4().num);
        }

    }
}
