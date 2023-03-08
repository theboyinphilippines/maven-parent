package com.maven.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: qianli
 * @date: 2023/3/8 -- 9:06 下午
 */

@EnableFeignClients
@SpringBootApplication
public class MavenManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MavenManagerApplication.class,args);

    }
}
