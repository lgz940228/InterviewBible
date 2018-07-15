package com.lgz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by lgz on 2018/7/12.
 */
@SpringBootApplication
@MapperScan("com.lgz.*")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
