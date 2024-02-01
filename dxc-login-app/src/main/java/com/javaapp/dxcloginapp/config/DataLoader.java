package com.javaapp.dxcloginapp.config;

import com.javaapp.dxcloginapp.model.User;
import com.javaapp.dxcloginapp.security.WebSecurityConfig;
import com.javaapp.dxcloginapp.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Component
public class DataLoader implements CommandLineRunner {

    private final UserService userService;

    @Override
    public void run(String... args) throws Exception {
        if (!userService.getUsers().isEmpty()) return;
        for (User user : USERS) {
            userService.saveUser(user);
        }
        log.info("Database has been initialised");
    }

    private static final List<User> USERS = Arrays.asList(
            new User("manager123", "password", "Alex", WebSecurityConfig.MANAGER),
            new User("user123", "password", "Bob", WebSecurityConfig.USER)
    );
}