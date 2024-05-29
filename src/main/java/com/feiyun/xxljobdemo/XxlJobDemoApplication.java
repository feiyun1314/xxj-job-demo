package com.feiyun.xxljobdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.feiyun.xxljobdemo.mapper")
public class XxlJobDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(XxlJobDemoApplication.class, args);
    }

}
