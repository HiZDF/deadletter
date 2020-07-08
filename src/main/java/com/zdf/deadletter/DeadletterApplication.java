package com.zdf.deadletter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeadletterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeadletterApplication.class, args);
        System.out.println("启动成功");
    }

}
