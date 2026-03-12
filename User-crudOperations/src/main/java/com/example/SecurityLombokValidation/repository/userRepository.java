package com.example.SecurityLombokValidation.repository;

import com.example.SecurityLombokValidation.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface userRepository extends JpaRepository<Users,Long> {


    Optional<Users> findByName(String name);
}
