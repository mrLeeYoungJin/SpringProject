package com.lyjguy.web.springdatajpa.repository;

import com.lyjguy.web.springdatajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
