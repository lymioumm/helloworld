package com.hit.demo;

public class StudentDemo {
//    如果你看到了一个方法的形式参数是一个类类型（引用类型），这里需要的其实是该类的对象
    public void method(Student s) {
//        调用的时候，把main方法中的s的地址传递到了这里 Student s = new Student();
        s.show();
    }
}
