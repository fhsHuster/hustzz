package com.nowcoder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

@Configuration
//可以使用SpringBootApplication,但是没有必要，通常是程序的入口使用这个注解
//普通的配置类可以使用Configuration
public class AlphaConfig {

    @Bean
    public SimpleDateFormat simpleDateFormat(){   //这种情况下方法名就是bean的名字
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

}
