package com.leroy.wxmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = { "com.leroy.wxmin.*.dao", "com.leroy.wxmin.dao" })
@EnableScheduling
@EnableCaching
public class WxminApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxminApplication.class, args);
    }

}
