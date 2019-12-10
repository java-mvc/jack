package com.example.service66;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    Integer addUser(String username) {
        System.out.println("adduser [username="+username+"]");
        if (username == null) {
            return 0;
        }
        return 1;
    }
}
