package com.soa.userservice;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class UserServiceProperties {
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
