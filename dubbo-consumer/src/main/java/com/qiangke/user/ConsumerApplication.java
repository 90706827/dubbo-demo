package com.qiangke.user;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author zhangguoq
 * @Date 2022/12/25 01:12
 **/
//@SpringBootApplication
//@ImportResource(locations="classpath:spring/dubbo-consumer.xml")
public class ConsumerApplication {
    public static void main(String[] args) {
//        SpringApplication.run(ConsumerApplication.class,args);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
        context.start();
        UserService demoService = (UserService) context.getBean("userService");
        String hello = demoService.findUser();
        System.out.println(hello);
    }
}
