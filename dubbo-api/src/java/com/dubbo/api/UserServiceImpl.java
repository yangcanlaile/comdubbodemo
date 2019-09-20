package com.dubbo.api;

import com.dubbo.api.UserService;

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
}
