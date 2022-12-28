package com.qiangke.user;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * @Description
 * @Author zhangguoq
 * @Date 2022/12/25 01:12
 **/
//@SpringBootApplication
//@ImportResource(locations="classpath:spring/dubbo-provider.xml")
public class ProviderApplication {
    public static void main(String[] args) throws InterruptedException {
//        SpringApplication.run(ProviderApplication.class,args);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
}
