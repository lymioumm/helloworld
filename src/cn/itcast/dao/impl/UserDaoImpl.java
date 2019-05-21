package cn.itcast.dao.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;

import java.util.ArrayList;

public class UserDaoImpl implements UserDao {
    //    为了让多个方法能够同时使用一个集合，就把集合定义为成员变量
//    为了不让外人看到，用private
//    为了让多个对象共享同一个成员变量，用static
    private static ArrayList<User> array = new ArrayList<User>();

    public boolean isLogin(String username, String password) {
//        遍历集合，获取每一个用户，并判断该用户的用户名和密码是否和传递过来的匹配
        boolean flag = false;
        for (User u : array) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void regist(User user) {
//        把用户信息存储集合
//        ArrayList<User>array=new ArrayList<User>();
        array.add(user);
    }
}
