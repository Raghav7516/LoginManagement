package com.web.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.login.model.Users;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByName(String username);
}
