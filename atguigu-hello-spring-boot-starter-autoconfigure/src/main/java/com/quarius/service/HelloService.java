package com.quarius.service;

import com.quarius.bean.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: dllAquarius
 * @Date: 2021/12/21
 * @Description:
 */

/**
 * 默认不要放在容器中
 */
public class HelloService {

    @Autowired
    HelloProperties helloProperties;
    public String sayHello(String username){
        return helloProperties.getPrefix()+":"+username+">"+helloProperties.getSuffix();

    }
}
