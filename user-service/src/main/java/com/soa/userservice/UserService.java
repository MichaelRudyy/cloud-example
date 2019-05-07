package com.soa.userservice;

import com.soa.userservice.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserService {
    private static HashMap<Integer, User> users = new HashMap<>();
    private static int currentId = 0;

    public User addUser(User newUser) {
        if (newUser.getId() == 0) {
            newUser.setId(currentId);
            users.put(currentId, newUser);
            currentId++;
        } else {
            users.put(newUser.getId(), newUser);
        }

        return newUser;
    }

    public User getUser(int id) {
        return users.get(id);
    }
}
