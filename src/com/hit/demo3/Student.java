package com.hit.demo3;

public class Student {
    private String name;
    public String getName() {
        return name;
    }
        /*
        * public void setName(Strign n)
        * {
        * name=n;//不用this关键字的以前用法，但是s的名字不够鲜明于是改为name
        * }
        *
        * */
        public void setName(String name) {
//            name="林青霞"；
//            name=name；//变量的使用规则：就近原则
//            这里是类名，目前还没有说过类似的用法，所以这个是有问题的
//            这里的调用只能通过对象名
//            这个对象如果存在，它应该代表的是Student的一个对象
//            那么，谁能够代表当前类的对象呢？java就提供了一个关键字this
//            Student.name=name;
            this.name = name;
        }
    }




