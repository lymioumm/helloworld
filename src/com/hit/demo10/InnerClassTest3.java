package com.hit.demo10;

public class InnerClassTest3 {
    public static void main(String[] args) {
        PersonDemo3 pd = new PersonDemo3();
        Person3 p = new Student33();
        pd.method(p);
        System.out.println("----");
        pd.method(new Person3() {
            public void study() {
                System.out.println("Good good study Day day up");
            }
        });
    }
}
