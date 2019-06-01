package com.soa.userservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingService {

    Logger LOG = LoggerFactory.getLogger(GreetingService.class);

    @Autowired
    private UserServiceProperties properties;

    @Value("${spring.application.name}")
    private String serviceName;

    public String getInfo(){
        return serviceName;
    }

    public String getGreeting(String name){
        if (name == null) {
            LOG.info("I'm going to say Hello to anonymous");
            return properties.getGreeting() + " you!" + " from : " + getInfo();
        } else {
            LOG.info("I'm going to say Hello to " + name);
            return properties.getGreeting() + ", " + name + " !" + " from : " + getInfo();
        }
    }
}
