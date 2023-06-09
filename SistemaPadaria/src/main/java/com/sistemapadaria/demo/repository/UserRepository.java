package com.sistemapadaria.demo.repository;

import com.sistemapadaria.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
