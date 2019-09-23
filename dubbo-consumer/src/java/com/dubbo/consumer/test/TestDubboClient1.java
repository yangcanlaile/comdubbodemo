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
        String str;
        while(!(str = read()).equals("quit")) {
            str = str.substring(0, str.length()-1);
            System.out.println(userService.getUser(str));
        }
        System.in.read();
    }

    public static String read() throws IOException {

        byte[] bytes = new byte[1024];
        int size = System.in.read(bytes);
        return new String(bytes, 0, size);
    }
}
