package com.soa.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Autowired
    private UserServiceProperties properties;

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @Value("${spring.application.name}")
    private String serviceName;

    public String getInfo(){
        return serviceName + " : " + instanceId;
    }

    public String getGreeting(String name){
        if (name == null) {
            //LOG.info("I'm going to say Hello to anonymous");
            return properties.getGreeting() + " you!" + " from : " + getInfo();
        } else {
            //LOG.info("I'm going to say Hello to " + name);
            return properties.getGreeting() + ", " + name + " !" + " from : " + getInfo();
        }
    }
}
