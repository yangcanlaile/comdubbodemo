package com.dubbo.consumer.test;

import com.dubbo.api.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class TestDubboClient1 {



    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-dubbo-consumer.xml");
        ((ClassPathXmlApplicationContext) context).start();
        UserService userService = context.getBean(UserService.class);

        System.out.println(userService.sayHi());



        System.in.read();
    }
}
