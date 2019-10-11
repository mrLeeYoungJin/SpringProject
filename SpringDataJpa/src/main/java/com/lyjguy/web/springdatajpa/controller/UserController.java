package com.lyjguy.web.springdatajpa.controller;

import com.lyjguy.web.springdatajpa.entity.User;
import com.lyjguy.web.springdatajpa.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") long id) {
        return userService.getUser(id);
    }
}
