package com.bupt.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.bupt.service.dao")
@ComponentScan(basePackages = { "com.bupt.web", "com.bupt.service" })
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}
