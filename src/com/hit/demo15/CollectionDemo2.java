package com.hit.demo15;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {

//        创建集合1
        Collection c1 = new ArrayList();
        c1.add("abc1");
        c1.add("abc2");
        c1.add("abc3");
        c1.add("abc8");

        Collection c2 = new ArrayList();
        c2.add("abc1");
        c2.add("abc2");
        c2.add("abc3");
        c2.add("abc4");
        c2.add("abc5");
        c2.add("abc6");
        c2.add("abc7");
        System.out.println("c1:"+c1);
        System.out.println("c2:"+c2);
        System.out.println("retainAll:" + c1.retainAll(c2));

        /*
        * retainAll方法的作用是仅保留此collection中那些也包含在指定collection的元素（可选操作）
        * 换句话说，移除此collection中未包含在指定collection中的所有元素
        * 此实现在collection上进行迭代，一次检查该迭代器返回的每个元素，
        * 以查看其是否包含在指定collection中，如果不是，则使用迭代器的remove方法将其从此collection中移除
        * 其次，返回值的意思是这样的：如果此collection由于调用而发生更改，则返回true
        * 再次，这个c1和c2里面的元素的c2包含c1，这样一来，调用c1.retainAll(c2)时候发现，
        * 不需要从c1中去除不在c2中的元素，因此这个c1不需要发生更改，那么返回值就是false,
        * 也就是说，这个方法的返回值是标识c1有没有改变，而不是这个方法是否执行正常或者成功
        * */
    }
}
