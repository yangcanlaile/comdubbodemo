package com.dubbo.consumer.test;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.dubbo.api.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class TestDubboClient {



    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-dubbo-consumer.xml");
        ((ClassPathXmlApplicationContext) context).start();
        UserService userService = context.getBean(UserService.class);
        userService.setName("yangcan");
        System.out.println(userService.sayHi());



        System.in.read();
    }
}
