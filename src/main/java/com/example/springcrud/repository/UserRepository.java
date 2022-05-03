package com.example.springcrud.repository;

import com.example.springcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
