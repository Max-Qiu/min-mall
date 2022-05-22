package com.maxqiu.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 启动
 *
 * @author Max_Qiu
 */
@SpringBootApplication
@MapperScan("com.maxqiu.mall.**.mapper")
@EnableCaching
public class MinMallApplication {
    public static void main(String[] args) {
        SpringApplication.run(MinMallApplication.class, args);
    }
}
