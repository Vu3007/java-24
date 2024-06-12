package com.example.movieapp.repository;

import com.example.movieapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
<<<<<<< HEAD
    Object findByEmail(String email);
=======
    Optional<User> findByEmail(String email);
>>>>>>> f26bf26f2b3ddaf48ba9fdfef84ec05492b9ebee
}