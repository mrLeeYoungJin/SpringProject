package com.lyjguy.web.springdatajpa.service;

import com.lyjguy.web.springdatajpa.ResourceNotFoundException;
import com.lyjguy.web.springdatajpa.entity.User;
import com.lyjguy.web.springdatajpa.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User getUser(long id) {

        log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>");

        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User data Empty Resource"));
    }

}
