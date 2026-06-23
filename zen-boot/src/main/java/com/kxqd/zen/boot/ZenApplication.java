package com.kxqd.zen.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.kxqd.zen")
public class ZenApplication {

    static void main(String[] args) {
        SpringApplication.run(ZenApplication.class, args);
    }
}
