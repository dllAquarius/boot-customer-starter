package com.quarius.auto;

import com.quarius.bean.HelloProperties;
import com.quarius.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: dllAquarius
 * @Date: 2021/12/21
 * @Description:
 */
@Configuration
@EnableConfigurationProperties(HelloProperties.class) //默认HelloProperties放在容器中
public class HelloSerivceAutoConfiguration {

    @ConditionalOnMissingBean(HelloService.class)
    @Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        return helloService;
    }


}
