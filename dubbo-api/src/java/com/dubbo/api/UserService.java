package com.dubbo.api;

import com.dubbo.beans.User;

public interface UserService {
    public void setName(String name);
    public String sayHi();
    public String getName();
    public User getUser(String id);
}
