package com.quarius.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Auther: dllAquarius
 * @Date: 2021/12/21
 * @Description:
 */
@ConfigurationProperties("aquarius.hello")
public class HelloProperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
