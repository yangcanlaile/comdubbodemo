package com.dubbo.api;

import com.dubbo.api.UserService;
import com.dubbo.beans.User;

import java.lang.management.ManagementFactory;
import java.util.Date;

public class UserServiceImpl implements UserService {
    private String name;
    public void setName(String name){
        this.name = name;
    }



    @Override
    public String sayHi() {
        return "hello " + name + "!";
    }

    @Override
    public String getName() {
        return this.name;
    }

    public User getUser(String id) {
       User user = new User();
       user.setBirthDay(new Date());
       user.setId(id);
       user.setName(ManagementFactory.getRuntimeMXBean().getName());
       return user;
    }
}
