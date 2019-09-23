package com.dubbo.beans;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    String id;
    String name;
    Date birthDay;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }



    @Override
    public String toString() {
        return "id=" + id + ",name=" + name + ",birthday: " + birthDay;
    }
}
