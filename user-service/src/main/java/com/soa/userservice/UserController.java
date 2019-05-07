package com.soa.userservice;

import com.soa.userservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private GreetingService greetingService;

    private static final Logger LOG = Logger.getLogger(UserController.class.getName());


    @PostMapping
    public User addUser(@RequestBody User user){
        LOG.info("Add new User : " + user);
        return userService.addUser(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id){
        User user = userService.getUser(id);
        LOG.info("Get User with id " + id + " : " + user);
        return user;
    }

    @GetMapping("/example")
    public User getExample(){
        return new User("Mike");
    }

    @GetMapping
    public String greeting(@RequestParam(value = "name", required = false) String name) {
        return greetingService.getGreeting(name);
    }
}
