package com.quarius.startertest.config;

import com.quarius.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: dllAquarius
 * @Date: 2021/12/21
 * @Description:
 */
@Configuration
public class MyConfig {

    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
