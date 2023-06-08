package com.blood.user.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})  // 排除security安全验证
public class BloodUserSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(BloodUserSystemApplication.class, args);
    }

}
