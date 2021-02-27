package com.example.security.springBootSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.security.springBootSecurity.security.database.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer>
{
    Optional<User> findByEmail(String email);
}
